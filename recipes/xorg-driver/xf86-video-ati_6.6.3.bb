require xorg-driver-video.inc
DEPENDS += " xineramaproto xf86miscproto drm xf86driproto"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "f6d559f9d20f61567d381916b376590f"
SRC_URI[archive.sha256sum] = "d08a429e1fb1620ae81839181a4dc6cd579d52fc440d44d7bba36d19be355780"
