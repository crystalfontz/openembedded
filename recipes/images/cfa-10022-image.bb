#Angstrom X11 image, with apps and kernel modules included

ANGSTROM_EXTRA_INSTALL += " \
			  " 
XSERVER ?= "xserver-kdrive-fbdev"
SPLASH ?= ' ${@base_contains("MACHINE_FEATURES", "screen", "psplash-angstrom", "",d)}'

export IMAGE_BASENAME = "cfa-10022-image"

DEPENDS = "task-base"
IMAGE_INSTALL = "\
    ${XSERVER} \
    task-base-extended \
    angstrom-x11-base-depends \
    kernel-modules \
    hal \
    pointercal \
    matchbox-wm \
    matchbox-keyboard matchbox-keyboard-applet matchbox-keyboard-im \
    matchbox-desktop \
    xserver-nodm-init \
    ttf-liberation-sans ttf-liberation-serif ttf-liberation-mono \
    xauth xhost xset xrandr \
    matchbox-sato \
    matchbox-config-gtk \
    matchbox-themes-gtk \
    matchbox-applet-startup-monitor \
    sato-icon-theme \
    settings-daemon \
    abiword \
    gnumeric \
    imagemagick emacs-x11 perl networkmanager lua5.1 gdbserver gtkmm \
    tslib \
    tslib-tests \
    tslib-calibrate \
    xset xserver-kdrive-fbdev xinit linux-input \
    xlogo \
    xeyes \
    xclock \
    gdk-pixbuf-loader-ani gdk-pixbuf-loader-bmp gdk-pixbuf-loader-gif gdk-pixbuf-loader-icns gdk-pixbuf-loader-ico gdk-pixbuf-loader-jpeg gdk-pixbuf-loader-pcx gdk-pixbuf-loader-png gdk-pixbuf-loader-pnm gdk-pixbuf-loader-qtif gdk-pixbuf-loader-ras gdk-pixbuf-loader-tga gdk-pixbuf-loader-tiff gdk-pixbuf-loader-wbmp gdk-pixbuf-loader-xbm gdk-pixbuf-loader-xpm \
    eog xterm evince \
    ipkg-utils networkmanager fennec \
    ${SPLASH} \
    ${ANGSTROM_EXTRA_INSTALL}"

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

#zap root password for release images
ROOTFS_POSTPROCESS_COMMAND += '${@base_conditional("DISTRO_TYPE", "release", "zap_root_password; ", "",d)}'

inherit image
