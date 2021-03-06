require xorg-lib-common.inc
DESCRIPTION = "X Screen Saver extension library"
LICENSE = "GPL"
DEPENDS += "libxext scrnsaverproto"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "ac2d697dd02f51e5c15f7104f4be5328"
SRC_URI[archive.sha256sum] = "6c75debca746060e0c2408a6ca119613ae02d1054adebd4b26ff8beee79bcc67"

RREPLACES_${PN} = "libxss"

XORG_PN = "libXScrnSaver"
