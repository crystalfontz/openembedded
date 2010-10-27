require linux.inc

PR = "r4"

BASE_KERNEL_VERSION = "2.6.30"
KERNEL_VERSION = "2.6.30"

# Mark archs/machines that this kernel supports
DEFAULT_PREFERENCE = "-1"

DEFAULT_PREFERENCE_cfa-10022 = "1"

S = "${WORKDIR}/git/"

# Local Repo
SRC_URI = "git://github.com/crystalfontz/linux-2.6.git;protocol=git;branch=cfa-10022-v0.3;tag=HEAD \
           file://defconfig"

