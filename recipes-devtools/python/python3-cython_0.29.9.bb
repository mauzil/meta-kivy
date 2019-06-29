DESCRIPTION="Cython"
SECTION="devel/python"
LICENSE="Apache-2.0"
LIC_FILES_CHKSUM="file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

PYPI_PACKAGE = "Cython"
BBCLASSEXTEND = "native"


inherit pypi setuptools3

SRC_URI[md5sum] = "bc0cca4658947bf2fb3fc10e8d090182"
SRC_URI[sha256sum] = "b88e033c06d29f3f3c760a3fb9837dce6e124d627bd562d1cdf93e9da16df215"

