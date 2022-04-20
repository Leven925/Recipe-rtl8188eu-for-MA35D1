SUMMARY = "rtl8188eu.ko for Wi-Fi module"
SECTION = "modules"
LICENSE = "CLOSED"

SRC_URI += " \
    file://8188eu.ko \
    "
do_package_qa[noexec] = "1"
do_install() {
    install -d ${D}/${base_libdir}/modules/${KV}
    install -m 0644 ${WORKDIR}/8188eu.ko ${D}/${base_libdir}/modules/${KV}/8188eu.ko
}

FILES_SOLIBSDEV = ""
FILES_${PN} = "${base_libdir}/modules/${KV}/8188eu.ko"
PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(ma35d1)"
