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

<img width="602" alt="1" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/d836581f-e37c-4aa3-b780-9a6eb59e6ccc">
<img width="960" alt="2" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/d1daae8d-31d6-460d-993e-6cd0108abc7f">
<img width="960" alt="3" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/8b30139b-2cdd-48d2-b128-0061e0b44a60">
<img width="960" alt="4" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/dd62cff2-d8ff-4f69-8d4a-9c2093ab06d3">
<img width="960" alt="5" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/21978f1d-bb47-47c7-9260-6de6476158e2">
<img width="960" alt="6" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/a38ca1a8-e531-41cc-82a1-4e31cb9fe4a8">
<img width="960" alt="7" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/d277b918-db81-4373-bbdb-2a1a097d0333">
<img width="960" alt="8" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/302d54b3-95e6-413d-9367-ba04f27124d1">
<img width="960" alt="9" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/dbbf97ae-e7ab-4064-8f2a-5054c1385624">
<img width="960" alt="10" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/f60ba2eb-c748-452b-a434-8b0b09993754">
<img width="960" alt="11" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/84853f28-6b66-4e3d-a708-48994cc1f199">
<img width="960" alt="12" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/75b43488-e4e5-46af-ba35-7366a517e72d">
<img width="950" alt="13" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/c827e338-3f03-4ab1-a862-e5410e527808">
<img width="950" alt="14" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/80afabc0-b810-4fa9-bd8d-b064f5fba1f1">
<img width="590" alt="15" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/9d2602c1-14c7-4144-9cb6-b800b69346e0">
<img width="950" alt="16" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/6e8b1158-4b41-4bdb-86a9-4b33653eda34">
<img width="960" alt="17" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/5f168174-ed82-4b88-a7d5-25f83ed9887c">
<img width="960" alt="18" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/d66d2972-3e02-42b8-8a27-8d391e3fc1f3">
<img width="960" alt="19" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/d0bdecb0-7848-48d3-9b15-528f0c15ffca">
<img width="960" alt="20" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/b778d308-6663-43bd-94b2-e18372a8c61a">
<img width="960" alt="21" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/cdac3f33-2497-42f6-98be-82ffab816ce2">
<img width="960" alt="22" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/f0722b6a-0dd1-4e64-bf06-60d3571657a1">
<img width="950" alt="23" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/c79e2891-11c7-46b0-9678-821aa6fd1b96">
<img width="960" alt="24" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/7fc9c33c-9fa5-4376-93ec-5bbb4aa74d01">
<img width="960" alt="25" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/986ba09d-1c90-44ca-b6e0-b916832d2aae">
<img width="950" alt="26" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/84c84a5b-a4dd-40a6-ab7b-a952f4eaff1a">
<img width="950" alt="27" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/632cfaa8-c59f-421b-912c-991f766879ec">
<img width="960" alt="28" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/4a2ee7fa-5ec4-4b14-b6db-02290f28c6b6">
<img width="960" alt="29" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/df51bfde-223e-4038-ade5-0457df50ca46">
<img width="960" alt="30" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/4b1430d1-ac8c-475c-babf-f4d96c9df0b1">
<img width="950" alt="31" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/4c2aa177-f9d7-42fd-94c4-639e0f032870">
<img width="950" alt="32" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/61ca0a82-7289-4458-a41a-2e27e547e895">
<img width="960" alt="33" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/f9ec2f07-ff4b-4856-a275-6e13f9c892aa">
<img width="960" alt="34" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/0a6e327a-b78a-4a69-adef-684ef1f21e2b">
<img width="960" alt="35" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/7fc0c769-b537-45ff-baf7-a78afa1add9b">
<img width="960" alt="36" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/028065e3-ed4d-4407-8581-7499750469a2">
<img width="960" alt="37" src="https://github.com/aymaneisruby/Distributed-Systems-with-GRPC/assets/105078337/1d82dec0-5671-4d21-9b1d-f27f082429cc">




















