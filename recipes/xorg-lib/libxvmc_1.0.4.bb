require xorg-lib-common.inc
DESCRIPTION = "X Video Motion Compensation extension library"
DEPENDS += "libxext libxv videoproto"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "b54600573daf9d1a29b952e8d35b389e"
SRC_URI[archive.sha256sum] = "1217825ba8d66198466ee8306d0d6d237d2dd80d0f0783c98701296791833abb"

XORG_PN = "libXvMC"
