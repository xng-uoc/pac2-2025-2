interfaces {
    dummy dum0 {
        address "2001:db8::13/128"
    }
    ethernet eth0 {
        address "172.20.20.13/24"
        address "3fff:172:20:20::a/64"
        description "Management Interface"
    }
    ethernet eth1 {
        ipv6 {
            address {
                eui64 "2001:db8:1:13::/64"
            }
        }
    }
    ethernet eth2 {
        ipv6 {
            address {
                eui64 "2001:db8:2:13::/64"
            }
        }
    }
    ethernet eth3 {
        ipv6 {
            address {
                eui64 "2001:db8:0:13::/64"
            }
        }
    }
    loopback lo {
    }
}
pki {
    ca clab {
        certificate "MIIDizCCAnOgAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzItMjAyNS0xIGxhYiBDQTAeFw0yNTA5MjgxNjA1NDlaFw0yNjA5MjgxNjA1NDlaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJwYWMyLTIwMjUtMSBsYWIgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDmlB+H8ZJLWPS6UKPwxsl9U1KjH3yXIDtiJ40wGVsOSKHgqcKcn5X2Opa38aS+4MA+I1at9ErFQKL0RNzLBY+qpUwLA7n0mVgbJiduUpuJKciufCR7oP9nnkXk77dmDKQstvXNMlUk8n1qpuz138pv535F3xXoQAqr3Nr/TS8Rje+7A+7U9Sfp7CAVjDCflOA12Fh3nZdaTruglCYtAewkPQPhHIApG25o7+m3LZrE1axuOD9TgtlII3aKCX+vEf4Lkrq1EKeAudVfZNwk0lxAe6R2tLtqiDHt11c71z1hJzKSRiMtnFcGKkY49Ecw8RcY/hl66T8BVXPEaDZbwPTxAgMBAAGjYTBfMA4GA1UdDwEB/wQEAwIChDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDwYDVR0TAQH/BAUwAwEB/zAdBgNVHQ4EFgQUsOYPI1H4kWkOPbpqfa4FYYwzVMYwDQYJKoZIhvcNAQELBQADggEBAA389XahSiCbJlGtEnlW1wHasgJouAir/7XINWWgj8CoMCWuVcmQldgSXfKbg+G52I0SMSEFva1lez3o6/jVJrQk4bHR6ds4CHyJTTp30hYvFJHotoDB0jJuWVgwbiVLc2UV98eLqDhIRrmkPDeBuYuezIlHeAwKoL0l4W4vBkGW03+6G9AbZN+ZeiwoLIPvBLvZDIzhMuNmUZGfwkjc8V0jNUJGfb0PD6kl+Fngm220ln30iz/yy9Cnc8FKwLpH+QEYvBnyoHnUfGSjPqmlabxKibwpK+TJn/KEeGRGAUk72gqRH8LGtbYWic0NophETAJ07ez4H+bCwdtbx4B29ME="
    }
    certificate self {
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzItMjAyNS0xIGxhYiBDQTAeFw0yNTA5MjgxNjA1NDlaFw0yNjA5MjgxNjA1NDlaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMTMucGFjMi0yMDI1LTEuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDZulfpSD05Yhgk4ve0eQrzyUpXoIEaIAT1pQNASeF+gsuhyFOxt7iDNHjfo8XcMx0oPB2WL+72svLXlBQxGuycLau0ZTuXJVux25Rw86ImCtoEDZoQ4IpcD97lGF54Fvxf84rJD64t/D1gXhCIPO1W7/gif3WG+wUgv3dorsnWOkBdycjnglE8nB7UdL8Zj1/4FJIMStttKNAcdbTEWHy+PlJKKz51mz08hDlL0QlwyHyfWC6rrCIOc5OXxhx0u8f0KYxDwBZ0PxW9bAaNIknwGsJLNdzpdnyyeFc79xJ440Ne0vLtNXCyyDHUVG4NDjH1LnnN1SvFaV95yX6tBOpDAgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUsOYPI1H4kWkOPbpqfa4FYYwzVMYwRwYDVR0RBEAwPoIGdnlvczEzghdjbGFiLXBhYzItMjAyNS0xLXZ5b3MxM4IVdnlvczEzLnBhYzItMjAyNS0xLmlvhwSsFBQNMA0GCSqGSIb3DQEBCwUAA4IBAQApu3ueXOtz1TkLuwXWiZLflFoQOxc+yC0KJSxImTvjwLPfc1lN9bsiMGG6r4NrgFJPMlauhQiup0sYED4SWSbk9Uhn32Q9rz0zZzSl6LfpJFpEt3PcJYuT1KBcKAq0tUFkwF4dS8DgEugidUhIP61QcdYApeci/t96v2MDwbOqmHHCfU+4pFotZ0befYi/CY/joSPSFban8MZ7L3kIe3JqsswdGgHmDBOykK9k3PWDOOB8Ja5d2f42GOReRxXPn5XiaT36R5ENVmCCqNZTMsE6N+PCr8Zlmk+AIKolZzdz1l4sOlrA0QFQvAIeRYu8fcBCq21uiBR/slTvvmRbmHxr"
        private {
            key "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDZulfpSD05Yhgk4ve0eQrzyUpXoIEaIAT1pQNASeF+gsuhyFOxt7iDNHjfo8XcMx0oPB2WL+72svLXlBQxGuycLau0ZTuXJVux25Rw86ImCtoEDZoQ4IpcD97lGF54Fvxf84rJD64t/D1gXhCIPO1W7/gif3WG+wUgv3dorsnWOkBdycjnglE8nB7UdL8Zj1/4FJIMStttKNAcdbTEWHy+PlJKKz51mz08hDlL0QlwyHyfWC6rrCIOc5OXxhx0u8f0KYxDwBZ0PxW9bAaNIknwGsJLNdzpdnyyeFc79xJ440Ne0vLtNXCyyDHUVG4NDjH1LnnN1SvFaV95yX6tBOpDAgMBAAECggEAS44xTKh/aobidwZ2TCAHD3NmQ4NU2dKLtgzV1Hzu7f6ImLNSa+Uj+BAA9Ca6lj/8mcZGxCQNKnoN8IaX/TRpMIdewwKwS7Kwn8dhu1KojcgNQQPRV5L8IJd3U4wB2G2tlcSHgF9bI+UZDXSHCygNerJaquoNSFKaxHL9BoxFSXwYTkUTf8KSQwTH59ZWPoPUGamnDo+GsSFXpwIOmmITb37EMqZpg+u4mP+F0AkVcbtVXbG5fA6njElaVqwez4KfIk9XRcHSFEylANwkVZrctUv7IkUeMfg9DPmx14xy+pLvkuhnQNfXGZ2mbgYPrbXB3RAkHkU027Vu135aVx0IzQKBgQD6eVjO8FUSm2CABVjWDAq5OX6A5K+kmdYHF5TVWM3to8Q/lLm5SxpiZ9kn/23eOSTqwnxNtQVbFe+DbcUlcjw3rsW/YsKTJRMOPiIA/DG4v9ETNjT72vR+eyR9xCzYec94SbunUruX0VsuNGcUWvkY8nfZG1ejdqVnOSQaVie91wKBgQDeiAy03S3dDs2CsdbpuWdJnrGdXk5efdGl4MmwVcILS41/4tbpLnllrquzN1yJ+15l0k+CO0lB5Fb8ORUOz2C7Acipshm3w1Sa/CN15yDR7xl8Ct05hSsh4TrRMoOxelHSAcIfHAf3W6D2UsDC4lnP2ezxl786tORe8i5ESAMxdQKBgQCfCxp3HGgIjpyx7bNBBxhwEK/hDFTzQbODgVfCOMdZ1Bky/i8IF0ZDogljum97IfHtF11ywjUKZ11UqQj8BBN0kAeExSMj5/C3pIBW+8xesX4CovL10UxaW7sKGN0ZAA/bI4aCcqgneIpbRm8Fn9Z4Hs43D4OQii/w4XmpN3e4tQKBgFNTZk6jM3U/Ab0aknraLc7nWWKv2XCQdFxEm8Enm41XMRjd+9M8z8A/c5Ob+06/jU1bPuJpCLlfoyK2zSfKh1H/DQBd7DtfLOML3stbTHLPsR89gjDzqH77M2b6H03pm5GjjujPOjxpVxBlVEClOTQXSh380GJPMeRLkv+GZ4uxAoGAFM7LfpFkIWbeVnmc6xQH6S9SKMn+4jAs7u/qn9hE1H6hcDgaak8HPOObZnCfo8Kb1iKh7DVq+9qMySjmlCPKpn5zCd1yTBVAbybbhSuzWkTY2uIMhlCuJQvl6THf5vXdGI63LV5VhIiyRCeie5MRvCjgrHdL5HTynU7c+Ojia/g="
        }
    }
}
protocols {
    isis {
        interface dum0 {
            passive
        }
        interface eth1 {
            circuit-type "level-2-only"
            network {
                point-to-point
            }
        }
        interface eth2 {
            circuit-type "level-2-only"
            network {
                point-to-point
            }
        }
        interface eth3 {
            passive
        }
        level "level-2"
        net "49.0001.0000.0000.0013.00"
    }
}
service {
    https {
        api {
            keys {
                id admin {
                    key "admin"
                }
            }
            rest {
            }
        }
        certificates {
            ca-certificate "clab"
            certificate "self"
        }
        listen-address "0.0.0.0"
    }
    ntp {
        allow-client {
            address "127.0.0.0/8"
            address "169.254.0.0/16"
            address "10.0.0.0/8"
            address "172.16.0.0/12"
            address "192.168.0.0/16"
            address "::1/128"
            address "fe80::/10"
            address "fc00::/7"
        }
        server time1.vyos.net {
        }
        server time2.vyos.net {
        }
        server time3.vyos.net {
        }
    }
    router-advert {
        interface eth3 {
            prefix 2001:db8:0:13::/64 {
            }
        }
    }
    ssh {
        listen-address "0.0.0.0"
    }
}
system {
    config-management {
        commit-revisions "100"
    }
    host-name "vyos13"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$5j1hU5jMu806xAk5$9xpDT2jRAz9oUC2WDHstzk0p7NTROAuIrNdUFjYnUD09iQIvFuzvMlD4beWstjKlaV27AhX.VA5k96jDUcXBO1"
                public-keys clab {
                    key "AAAAB3NzaC1yc2EAAAADAQABAAABgQCrNNRvXqLqgzLt/RnlXU5HGKIjhQWlW5hr0OCJz8zMR9TeraWe+pOehLlzhJQ4Nd9SF/7mekT2jQitbv47Nrb9p2FRAnoxRVWuGXc+tPsa8tlZnV9cVZ7EBaxRU27xBmU0bfLI8u08/atsCsri30nPoZj0MvGMLHDnp++FA+3NM/3WNOdv+eJ06H0KNmW8swq/tzkWbX+OmxCG3FDs9l0Q1mcMVePHwCy1AwClkcd3bOpIcvQ6h49wBlTwoKK8tmcbuT62wkN2AWEcYwTHgul1P0JTtUbYylX+q5lBqMcZm0YWJMY2idyGHLyOCPNaV+YdiegvnIqyKLfiUEQ3nyUQK9KpiNQs2xFZ5TUg26wzZpvAyzRpLYlycw3L6Rc82fKxO60ZgZsmvtzYEga8Cp+KMMdOhbzBxn5rRy1pTp7CgVFLldEL9i2HBzaJEqwbsC5DdjzxoU0wYUq/jvBfGY8wutQHp2txCaMGUOA/GEYPUuzKQRFj5JgKwYkMxZ0oock="
                    type "ssh-rsa"
                }
            }
        }
    }
    syslog {
        local {
            facility all {
                level "info"
            }
            facility local7 {
                level "debug"
            }
        }
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@19:flow-accounting@1:https@7:ids@1:interfaces@33:ipoe-server@4:ipsec@13:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:ntp@3:openconnect@3:openvpn@4:ospf@2:pim@1:policy@8:pppoe-server@11:pptp@5:qos@2:quagga@11:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@2:sstp@6:system@29:vrf@3:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 1.5-stream-2025-Q2
