# Culture du Québec — préparation Google Play

## Identité
- Nom de l'application : Culture du Québec
- Application ID : `quebec.culture.donnees`
- Type : outils / culture / données
- Application indépendante, non affiliée au gouvernement du Québec.

## Description courte proposée
Normalisez, documentez et explorez des données culturelles québécoises.

## Description longue proposée
Culture du Québec aide les organismes culturels à importer, nettoyer, cartographier et documenter leurs catalogues de données. L’application prend en charge CSV et XLSX, propose des profils de travail sectoriels, conserve les validations humaines, produit des diagnostics et prépare des exports PDF, CSV et ZIP. Elle permet aussi d’explorer des données culturelles publiques du Québec et une carte interactive.

Les profils normatifs intégrés servent à la préparation et au diagnostic. Lorsqu’une exigence sectorielle n’est pas confirmée par une source publique précise, elle est présentée comme à valider plutôt que comme obligatoire.

## Confidentialité / fiche Sécurité des données
État correspondant à la version 3.8.0 :
- pas de compte utilisateur;
- pas de publicité intégrée;
- pas d’analytique interne;
- pas de permission de localisation;
- catalogues personnels traités et stockés localement;
- accès Internet pour données publiques, liens officiels et tuiles OpenStreetMap;
- export ou partage seulement après action explicite de l’utilisateur.

Avant publication, vérifier la fiche « Sécurité des données » dans Play Console par rapport au binaire réellement téléversé.

## Éléments à fournir dans Play Console
- icône 512 × 512;
- graphique de fonctionnalité 1024 × 500;
- captures d’écran téléphone;
- catégorie et coordonnées de contact;
- URL publique de politique de confidentialité;
- classification du contenu;
- formulaire Sécurité des données;
- public cible;
- déclaration sur les publicités;
- AAB signé avec clé de production / Play App Signing.

## Vérifications release
1. Installer une release sur un appareil réel.
2. Tester import CSV et XLSX réels.
3. Vérifier persistance après fermeture et relance.
4. Tester carte : glisser, pincer, double-taper, marqueurs.
5. Tester PDF, ZIP et CSV.
6. Tester retour arrière et rotation des écrans critiques.
7. Vérifier absence de superposition avec barres système.
8. Vérifier tous les liens et sources publiques.
9. Vérifier que les déclarations de confidentialité correspondent au code final.
10. Signer le bundle final et le tester via une piste interne Play Console.
