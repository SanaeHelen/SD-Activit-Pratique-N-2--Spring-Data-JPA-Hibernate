package com.example.hospital;

import com.example.hospital.entities.*;
import com.example.hospital.repositories.ConsultationRepository;
import com.example.hospital.repositories.MedecinRepository;
import com.example.hospital.repositories.PatientRepository;
import com.example.hospital.repositories.RendezVousRepository;
import com.example.hospital.service.HospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication {

    public static void main(String[] args) {
        // Démarrer l'application Spring Boot
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Bean
    CommandLineRunner start(HospitalService hospitalService,
                            PatientRepository patientRepository,
                            MedecinRepository medecinRepository,
                            RendezVousRepository rendezVousRepository){
        return args -> {
            // Ajouter des patients
            Stream.of("Mohammed","Hassan","Najat","Mounir","Fatima")
                    .forEach(name ->{
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setDateNaissance(new Date());
                        patient.setMalade(false);
                        hospitalService.savePatient(patient);

                    });
            // Ajouter des medecins
            Stream.of("Ayman","Hanan","Yasmine")
                    .forEach(name ->{
                        Medecin medecin = new Medecin();
                        medecin.setNom(name);
                        medecin.setEmail(name+"@gmail.com");
                        medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                        hospitalService.saveMedecin(medecin);

                    });

            // Consulter un patient par son identifiant
            System.out.println("***************************");
            System.out.println("Consulter le patient dont l'identifiant est 3:");
            Patient patient = patientRepository.findById(3L).orElse(null);
            System.out.println(patient.toString());
            System.out.println("***************************");

            // Chercher un patient par son nom
            System.out.println("Le patient Mohammed");
            Patient patient1 = patientRepository.findByNom("Mohammed");
            System.out.println(patient1.toString());
            System.out.println("***************************");

            // Consulter tous les patients
            System.out.println("Consulter tous les patients");
            List<Patient> patients = patientRepository.findAll();
            patients.forEach(p -> {
                System.out.println(p.toString());
            });
            System.out.println("***************************");

            // Mettre à jour un patient
            Patient patientToUpdate = patientRepository.findByNom("Mohammed");
            patientToUpdate.setNom("Anas");
            hospitalService.savePatient(patientToUpdate);

            // Supprimer un patient par son identifiant
            patientRepository.deleteById(2L);

            // Consulter un médecin par son nom
            Medecin medecin= medecinRepository.findByNom("Yasmine");

            // Créer un rendez-vous
            RendezVous rendezVous = new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient);
            hospitalService.saveRDV(rendezVous);

            // Consulter un rendez-vous par son identifiant
            RendezVous rendezVous1= rendezVousRepository.findById(1L).orElse(null);

            // Créer une consultation
            Consultation consultation= new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRendezVous(rendezVous1);
            consultation.setRapport("Rapport de la consultation ......................");
            hospitalService.saveConsultation(consultation);


        };

    }



}
