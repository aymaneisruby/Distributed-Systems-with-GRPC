# Distributed-Systems-with-GRPC
* ## Objectifs : 
<p align="justify">Pour illustrer les quatre modèles de gRPC, nous allons prendre comme exemple un service de conversion de monnaie. Imaginons que nous ayons un microservice appelé "Bank Service" qui expose différentes opérations de conversion de devises.</p>

* ### Unary Model (Modèle unidirectionnel) :
<p align="justify">Dans ce modèle, le client envoie une seule requête au serveur et attend une seule réponse. Dans notre cas, le client peut envoyer une requête avec le montant à convertir et les devises source et cible. Le serveur effectue la conversion et renvoie la réponse au client avec le montant converti. Ce modèle convient bien pour les conversions simples et rapides.</p>

* ### Server Streaming Model (Modèle de streaming côté serveur) :
<p align="justify">Dans ce modèle, le client envoie une requête au serveur, mais le serveur renvoie une séquence de réponses. Dans notre exemple, le client peut envoyer une requête pour obtenir les taux de change entre différentes devises. Le serveur peut ensuite diffuser en continu les taux de change au client, lui permettant de recevoir les mises à jour en temps réel.</p>

* ### Client Streaming Model (Modèle de streaming côté client) :
<p align="justify">Dans ce modèle, le client envoie une séquence de requêtes au serveur, mais le serveur ne renvoie qu'une seule réponse. Dans notre cas, le client peut envoyer plusieurs requêtes avec des montants à convertir. Le serveur attend de recevoir toutes les requêtes, effectue les conversions correspondantes et renvoie une seule réponse avec les montants convertis agrégés.</p>

* ### BiDirectional Streaming Model (Modèle de streaming bidirectionnel) :
<p align="justify">Dans ce modèle, à la fois le client et le serveur peuvent envoyer une séquence de messages. Le client peut envoyer des requêtes de conversion de monnaie à mesure que les montants sont disponibles, et le serveur peut renvoyer les réponses de conversion correspondantes. Ce modèle est adapté lorsque le client et le serveur ont une interaction continue et ont besoin de communiquer de manière asynchrone.</p>

<p align="justify">Chacun de ces modèles de gRPC offre des fonctionnalités spécifiques pour répondre à différents besoins. Dans le contexte d'un service de conversion de monnaie, ces modèles peuvent être utilisés pour des scénarios tels que la conversion unique, le suivi des taux de change en continu, l'envoi de multiples conversions en lot, ou encore une interaction continue entre le client et le serveur pour des conversions dynamiques.</p>


<img width="602" alt="1" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/879c8b60-1b62-4233-9184-a61d4036f15d">
<img width="960" alt="2" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/81074ff4-191e-428e-9918-0b7bfbcf15c6">
<img width="960" alt="3" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/d23ffe11-ef0f-44a4-a506-3b045a0b8c23">
<img width="960" alt="4" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/f102c3af-f5a0-412a-9c8d-2771c1344fb1">
<img width="960" alt="5" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/ccd9e445-ff51-4332-a5a1-d47c5ee8cb7f">
<img width="960" alt="6" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/8d5fd878-2c6c-41e7-8424-bfb63a39054a">
<img width="960" alt="7" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/41f7a53e-63c6-436c-b371-44cd3b7302e0">
<img width="960" alt="8" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/ccf856e5-d0d4-41fb-9deb-05f33d018504">
<img width="960" alt="9" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/d118c99b-b339-4ed1-90a5-eeb9cdc4f495">
<img width="960" alt="10" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/6ecd51e5-eb8c-410e-a432-46adf3e9a33e">
<img width="960" alt="11" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/b01f3787-6999-4e33-9feb-7f3eda480dd7">
<img width="960" alt="12" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/c5939eb1-94d4-4e30-8048-5dfad751fcef">
<img width="950" alt="13" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/648d1dfc-c469-4452-b4a4-7bb7ab027681">
<img width="950" alt="14" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/3c2127b1-4934-4d8a-98aa-6f51d3598cd2">
<img width="590" alt="15" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/71462fe9-c39f-49ff-a903-7ac4c2e593a9">
<img width="950" alt="16" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/24ea4931-2307-4910-95fe-5b59eee5478c">
<img width="960" alt="17" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/14686240-1468-419a-9a3c-42761b1f7e63">
<img width="960" alt="18" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/e8724474-a615-4db1-bc96-ddb57cdea4a4">
<img width="960" alt="19" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/a37040b5-d9fd-4832-bfec-539f94437275">
<img width="960" alt="20" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/87a7f7dd-c0b4-4e58-910b-234f3a29e4eb">
<img width="960" alt="21" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/5d67a6b4-00e3-479f-858f-9ee96f9d5e56">
<img width="960" alt="22" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/85861a35-543f-4bd9-877f-f5d1a9e99109">
<img width="950" alt="23" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/91e1c0c1-4bb7-4fce-a07f-bc5a16d1d8a0">
<img width="960" alt="24" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/12c68529-6e50-4f69-be2f-86537ea1a62f">
<img width="960" alt="25" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/570c5fc4-7017-4418-884c-429079c4198d">
<img width="950" alt="26" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/c64391f2-ab7a-4eef-a625-be63ab1eb679">
<img width="950" alt="27" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/9b96dae2-a371-4fe9-afed-97033e694ae9">
<img width="960" alt="28" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/7c3e07bc-3f05-4150-9fba-43934432ea66">
<img width="960" alt="29" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/7cf0d5e7-7517-4337-bf86-2b5a8f99429f">
<img width="960" alt="30" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/ebee32fe-b820-4403-b141-7c851d0faad5">
<img width="950" alt="31" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/10e177e9-28a7-4048-80e3-782f6fb38a70">
<img width="950" alt="32" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/99a3fd5b-3b74-4e0e-b50e-ed32255a130d">
<img width="960" alt="33" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/9d8e1d50-f27b-4c09-b346-433e5e4334ab">
<img width="960" alt="34" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/fa40964c-cf1b-4db2-b308-72c745c90457">
<img width="960" alt="35" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/17d302dd-fdb9-453d-8bba-9d9996750d2d">
<img width="960" alt="36" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/58996a09-a4ba-4bb5-8801-626b3b1479e3">
<img width="960" alt="37" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/dba17967-a6e7-4fd0-a3e1-8e607fce6449">
