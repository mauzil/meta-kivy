DESCRIPTION="Kivy"
SECTION="devel/python"
LICENSE="Apache-2.0"
LIC_FILES_CHKSUM="file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"
PYPI_PACKAGE = "Kivy"
BBCLASSEXTED = "native nativesdk"

SRC_URI[md5sum] = "638c6ca80dd079e2576b4acc56597669"
SRC_URI[sha256sum] = "4d0e596f74271e901b551f77661dde238df4765484fce9f5d1c72e8022984e84"

inherit pypi setuptools3


DEPENDS = " \
	python3-cython \
	gstreamer1.0 \
	libsdl2-mixer \
"
