# Test
#
LICENSE="MIT"
LIC_FILES_CHKSUM="file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302" 


SRCREV="${AUTOREV}"
SRC_URI = " git://git@service.faresoftware.it:/home/git/Prove/hello-kivy.git;protocol=ssh "


S="${WORKDIR}/git"

inherit setuptools3 python3native

