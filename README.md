# Timber

# Development

```python

# clone a repository 
$ git clone https://github.com/kushkota/Timber.git

cd Timber

greenfoot project.greefoot

```

```python3

# Investigation

This investigaton will  make your head spin!

$ curl --head https://www.greenfoot.org/download/files/Greenfoot-linux-371.deb
HTTP/1.1 200 OK
Server: Apache/2.4.41 (Ubuntu)
Content-Type: application/x-debian-package <-----


$ curl -s -O https://www.greenfoot.org/download/files/Greenfoot-linux-371.deb
-s, --silent        Silent mode
-O, --remote-name   Write output to a file named as the remote file

$ file Greenfoot-linux-371.deb
Greenfoot-linux-371.deb: Debian binary package (format 2.0), with control.tar.xz, data compression xz

- determine file type


*********** Extracting Process******

// not successful

 - an archiving utility
-x, --extract, --get       extract files from an archive
 -J, --xz                   filter the archive through xz

Option2:
- package manager for Debian
-i|--install       <.deb file name>...


Option3:
- Simple tool to install deb files

$ gdebi <the remote file>


$ sudo apt info greenfoot

Status: install ok installed
Installed-Size: 430 MB
APT-Manual-Installed: yes
Description: A simple but powerful Java IDE.


==================================

Windows(RDP) client ------------> server WSL2

Usign more specialized APT tools like apt-get: - APT package handling utility -- command-line interface
$ sudo apt update && sudo apt -y upgrade

update - Retrieve new lists of packages
upgrade - Perform an upgrade

Arhitecture 
Windows[RDP]    -------------------> WSL2[ Remote Desktop Protocol (RDP) server]
client computer                     server
                                    Package: xrdp
                                    xrdp accepts connections from freerdp, rdesktop, and the
                                    remote desktop clients of
                                    Microsoft Windows operating systems

----------------------------------
// Detemine to use sudo based on manual pages or reference manuals
$ whatis apt
apt (8)              - command-line interface

$ man man
8   System administration commands (usually only for root)

$ sudo apt show xrdp
-----------------------------------

$ sudo apt install -y xrdp
$ sudo apt install -y xfce4

Description: Meta-package for the Xfce Lightweight Desktop Environment
 Xfce is a lightweight desktop environment for unix-like operating systems.


 This package is a metapackage; it depends on the core packages of the Xfce4
 desktop environment and recommends some extra Xfce4 packages.

sudo apt install -y xfce4-goodies

Description: enhancements for the Xfce4 Desktop Environment
 The "Goodies for Xfce" project includes additional software and artwork that
 are related to the Xfce desktop, but not part of the official release.


sudo cp /etc/xrdp/xrdp.ini /etc/xrdp/xrdp.ini.bak

$ file /etc/xrdp/xrdp.ini
/etc/xrdp/xrdp.ini: Microsoft Windows Autorun file

$ cat /etc/services | grep 3389
ms-wbt-server   3389/tcp

// - stream editor for filtering and transforming text
// edit files in place
// transforming text /g globally
sudo sed -i 's/3389/3390/g' /etc/xrdp/xrdp.ini

echo xfce4-session > ~/.xsession

sudo vim  /etc/xrdp/startwm.sh

#test -x /etc/X11/Xsession && exec /etc/X11/Xsession
#exec /bin/sh /etc/X11/Xsession

# xfce
startxfce4


sudo /etc/init.d/xrdp start OR $ sudo service xrdp start

WSL Trick: no need to jump and start RDP app

$ mstsc.exe /v:localhost:3390

================Windows(cmd)========


===================================

## System Information

$ cat /etc/os-release | grep ID_LIKE
ID_LIKE=debian

$ lsb_release -d
Description:    Ubuntu 20.04.4 LTS

- print distribution-specific information
-d, --description  show description of this distribution

==============Linux================
$ uname -s
Linux
-s, --kernel-name        print the kernel name
$ wsl.exe -l
Windows Subsystem for Linux Distributions:
Ubuntu-20.04 (Default)

--list, -l [Options]
        Lists distributions


$ wsl.exe --status
Default Distribution: Ubuntu-20.04
Default Version: 2

Kernel version: 5.10.102.1

--status
        Show the status of Windows Subsystem for Linux.

===================================

```

```python3
# Project

https://github.com/kushkota/Timber

```
