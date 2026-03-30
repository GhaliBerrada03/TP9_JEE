# 🔐 Spring Security Demo

## 📌 Description
Ce projet est une application **Spring Boot** qui démontre la sécurisation des routes avec **Spring Security** via une authentification simple et des rôles.

## ⚙️ Technologies utilisées
- ☕ Java
- 🌱 Spring Boot
- 🔐 Spring Security
- 🌐 Thymeleaf
- 📦 Maven

## 🚀 Fonctionnalités
- 🔑 Page de connexion personnalisée
- 👤 Authentification avec utilisateurs en mémoire
- 🛡️ Gestion des rôles `USER` et `ADMIN`
- 🚧 Protection des routes selon le rôle

## 👥 Comptes de test
- 👑 **admin / 1234** → accès complet
- 👤 **user / 1111** → accès limité

## 🌍 Accès
- 🔓 `/login` : page de connexion
- 🏠 `/` : page d’accueil après connexion
- 👤 `/user/dashboard` : USER et ADMIN
- 👑 `/admin/dashboard` : ADMIN uniquement

## ▶️ Lancement du projet
![Screenshot 2026-03-30 110122.png](../../../OneDrive/Images/Screenshots/Screenshot%202026-03-30%20110122.png)
![Screenshot 2026-03-30 110129.png](../../../OneDrive/Images/Screenshots/Screenshot%202026-03-30%20110129.png)