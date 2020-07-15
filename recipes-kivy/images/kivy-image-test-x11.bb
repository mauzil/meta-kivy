# Immagine di test per Kivy
LICENSE="MIT"
LIC_FILES_CHKSUM="file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302" 

include recipes-graphics/images/core-image-x11.bb

IMAGE_INSTALL_append = " \
        python3-modules \
	hello-kivy \
"
