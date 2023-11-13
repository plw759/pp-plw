
# if [ ! -d "/opt/pharo" ]; then
#     echo "making directory /opt/pharo"
#     mkdir -p /opt/pharo
# fi

if [ ! -d "pharolauncher" ]; then
    echo "downloading pharo launcher"
    curl -o PharoLauncher.zip -L https://files.pharo.org/pharo-launcher/linux64
    unzip PharoLauncher.zip
    rm PharoLauncher.zip 
fi
pharolauncher/pharo-launcher 