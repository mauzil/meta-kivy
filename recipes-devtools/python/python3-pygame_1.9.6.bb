FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
DESCRIPTION="Pygame"
SECTION="devel/python"
LICENSE="Apache-2.0"
LIC_FILES_CHKSUM="file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"
PYPI_PACKAGE = "pygame"
BBCLASSEXTED = "native nativesdk"


RDEPENS_${PN} = " \
	pkgconfig-native \
	libsdl2-native \
	freetype-native \
"

DEPENDS = " \
	tiff \
	zlib \
	libpng \
	jpeg  \
	libsdl2 \
	libsdl2-image \
	libsdl2-mixer \
	freetype \
	flac \
	libmikmod \
	libvorbis \
"

SRC_URI[md5sum] = "36f8817874f9e63acdf12914340b60e9"
SRC_URI[sha256sum] = "301c6428c0880ecd4a9e3951b80e539c33863b6ff356a443db1758de4f297957"

inherit pypi setuptools3
