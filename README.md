# DiceGAE

## Before
*    Add gcloud in your path:
**       run /media/Enseignant/google-cloud-sdk/install.sh
*    gcloud config set account yourname
*    gcloud auth login
*    gcloud config set project yourproject

## Install and Run
* cp ~molli-p/.m2/settings.xml ~/.m2/
* git clone https://github.com/momo54/DiceGAE.git
* cd DiceGAE
* mvn compile
* import as existing maven project into eclipse
* * ~molli-p/eclipse/eclipse
* mvn appengine:deploy
* gcloud app browse
