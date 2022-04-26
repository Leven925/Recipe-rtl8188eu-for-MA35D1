# Recipe-rtl8188eu-for-MA35D1
Yocto rtl8188eu for MA35D1

This recipe will add rtl8188eu.ko to MA35D1 root file system

1. git clone this recipe to meta-ma35d1 recipe-supports
2. Add rtl8188eu to conf/local.conf IMAGE_INSTALL_append
3. bitbake your image

The 8188eu.ko will locate at /lib/modules/5.4.181/extra
insmod 8188eu.ko to install the kernel module
