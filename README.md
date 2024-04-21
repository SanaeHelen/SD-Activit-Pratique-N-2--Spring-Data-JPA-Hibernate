
# SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate


1. Installer IntelliJ Ultimate
   
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/da3e3a60-e855-4c54-ac07-3266bd07a9ec)

3. Créer un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombock

   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/31bda72a-9059-4ae4-b794-2286c367d628)

4. Créer l'entité JPA Patient ayant les attributs :
       - id de type Long
       - nom de type String
       - dateNaissanec de type Date
       - malade de type boolean
       - score de type int

   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/a62032de-9bc3-4bb2-8be7-f532817e3295)

6. Configurer l'unité de persistance dans le ficher application.properties

   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/e7615545-6912-4c6a-b8d1-b7dc2f7f2cca)
   ![hospital2](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/7f4adac6-9f45-49fd-b30f-9317640b5332)


8. Créer l'interface JPA Repository basée sur Spring data
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/4eb458d2-4ba8-40e9-8fda-f1cd0d6e2b60)

10. Tester quelques opérations de gestion de patients :
    
    - Ajouter des patients
      
      ![hospital1](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/aba17753-aff6-46e7-b540-8fa7f446321b)
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/96503ea3-9f34-4497-bc44-8bb56b4edd20)



    - Consulter tous les patients
      
      ![hospital15](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/b7f3cf12-cde9-47dd-9dbc-d6eff29cb72b)
      ![hospital16](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/cd83713d-41ca-409a-857f-2cf20bd796d8)


    - Consulter un patient
      
      ![hospital11](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/012c32f9-03a5-4fcc-ac07-77b437491817)
      ![hospital12](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/95053cc5-7d7d-4dbe-b84b-da2c3ab10a3a)


    - Chercher des patients
      
      ![hospital13](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/93618296-71c6-44f5-93a9-3cfef5e40ddb)
      ![hospital14](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/6614ae26-761b-49eb-afb2-c420ab7bcb37)


    - Mettre à jour un patient
      
      ![hospital7](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/6d9186a1-ec1c-491c-ab00-3a1f5eed8e36)
      ![hospital8](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/cb143f55-5b37-4161-8230-fa123674512e)


    - supprimer un patient
      
      ![hospital9](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/d42cb02c-f207-4953-9540-63f15bcc85e8)
      ![hospital10](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/cf1b2db6-e403-4318-98f5-47cc6fca8eb0)

12. Les entités Médecin, rendez-vous, consultation :
    ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/41b74c3f-9534-434b-b071-55b078b4f977)
    ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/e2996d56-db3b-4a57-9bf1-7cba1b3fd6bc)
    ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/83934ee2-1542-4294-9ef5-498de4bcc3ef)

13. Créer l'interface JPA Repository basée sur Spring data
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/351bb612-3786-422a-9971-5e2610657012)
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/12edeb8b-66db-44d0-83f1-febed4dcc996)
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/84287cbf-6ae3-4544-bdda-b1d47c2bedd9)

13. Les opérations de gestion de ces entités :
    - Ajouter des médecins
      
    ![hospital5](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/a2edbcfb-3b80-4ad6-8a9a-22d2270100e3)
    ![hospital6](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/3c32e11e-de92-4b26-9af9-a5b553114885)

    - Créer un rendez-vous

    ![hospital19](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/8d581b41-9b9a-4afa-a1c1-09a347fe9716)
    ![hospital20](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/f838e84f-4ea4-4142-82bf-358363a9bed2)

    - Créer une consultation
   
    ![hospital21](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/96e4dd92-c872-4834-9bb9-3db42eedf2e0)
    ![hospital22](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/4fd3bf7d-10b9-49d9-9017-c2a8485daada)
    



      


12. Migrer de H2 Database vers MySQL
    ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/8fb1164b-bb44-4065-831b-b53bd36e0837)
    ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/db7c9bc1-30ec-42e1-b6ea-caf2c680d1b9)

    - Ajouter des patients
      
      ![hospital1](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/aba17753-aff6-46e7-b540-8fa7f446321b)
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/60246c0b-4e94-435c-80d5-445ea6f35e19)


    - Ajouter des médecins
      
      ![hospital5](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/a2edbcfb-3b80-4ad6-8a9a-22d2270100e3)
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/073d3bad-61c2-404f-a3fc-d49e34bbbf3a)


    - Créer un rendez-vous

      ![hospital19](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/8d581b41-9b9a-4afa-a1c1-09a347fe9716)
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/68a86f59-5d92-417e-b74c-2a13ebf8f074)

    
    - Créer une consultation
   
      ![hospital21](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/96e4dd92-c872-4834-9bb9-3db42eedf2e0)
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/65e387b7-8816-4902-999c-f2a96e4a2aa3)


    - Mettre à jour un patient
      
      ![hospital7](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/6d9186a1-ec1c-491c-ab00-3a1f5eed8e36)
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/3de9d915-d5ea-4e0a-bffb-f5e3fd037c9d)
    

    - supprimer un patient
      
      ![hospital9](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/d42cb02c-f207-4953-9540-63f15bcc85e8)
      ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-HibernateP1/assets/136022070/9048fd61-7bb9-48f6-a367-c6ba0c905507)

13.  Les entités user et role :

      - l'entité user :

          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/3b6dda8f-441f-4512-83d0-73e7733b552e)


      - l'entité role :
        
          ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/9a99e039-ba99-4f70-b5f9-be7112434d14)
          
        
14. les interfaces JPA Repository de user et role:
    
    ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/877292bb-c02c-476e-b9b5-10726905c191)
    ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/4b23f6ad-0415-4498-913c-f9d594b01284)

6. Configurer l'unité de persistance dans le ficher application.properties
   
    ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/30d680d7-a8ef-43b4-b3d9-c43e9df45bf1)
    ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/3c671a3c-6bd3-458c-a5d8-e5a0cfe7e82d)

15. Tester quelques opérations de gestion de users et roles :
    - Ajouter des users:
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/69854360-6633-438d-806e-6f7e1cb48ff4)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/6e1e177d-7a86-46c0-9996-1ce7e0b309b9)

 
    - Ajouter des rôles:
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/b8b3f3d4-93c5-41fa-bbc1-1292706965b8)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/d9f2510d-2db7-46bf-8112-8de1f7a80cb0)


    - Assigner des rôles aux utilisateurs:
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/eb54636f-19bd-4cdc-af48-ebcf413488f8)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/8dfc4496-cc66-4c77-b365-94c0568734cb)


    - Authentifier un utilisateur:
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/66c4dc28-36da-47da-91e9-b3018a2994e0)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/9dd20977-e630-4946-b6ac-564e1ebfecbb)

 
7. Migrer de H2 Database vers MySQL
   
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/81f76f1a-96c3-4dcd-a505-f47fe42bbf70)

   
   - Ajouter des users:
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/69854360-6633-438d-806e-6f7e1cb48ff4)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/a3d199b7-3089-476d-979f-f1976f2d4dab)

 
    - Ajouter des rôles:
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/b8b3f3d4-93c5-41fa-bbc1-1292706965b8)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/fb028dc6-569e-4eae-a83b-e389a91949dd)

    - Assigner des rôles aux utilisateurs:
      
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/eb54636f-19bd-4cdc-af48-ebcf413488f8)
        ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-2--Spring-Data-JPA-Hibernate/assets/136022070/33664eee-9c7d-4635-a85d-469a5deb1f6b)

  
    
    



      

