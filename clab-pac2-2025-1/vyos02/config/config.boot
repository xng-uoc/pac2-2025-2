interfaces {
    dummy dum0 {
        address "2001:db8::2/128"
    }
    ethernet eth0 {
        address "172.20.20.32/24"
        address "3fff:172:20:20::2/64"
        description "Management Interface"
    }
    ethernet eth1 {
        ipv6 {
            address {
                eui64 "2001:db8:2:11::/64"
            }
        }
    }
    ethernet eth2 {
        ipv6 {
            address {
                eui64 "2001:db8:2:12::/64"
            }
        }
    }
    ethernet eth3 {
        ipv6 {
            address {
                eui64 "2001:db8:2:13::/64"
            }
        }
    }
    ethernet eth4 {
        ipv6 {
            address {
                eui64 "2001:db8:2:14::/64"
            }
        }
    }
    ethernet eth5 {
        ipv6 {
            address {
                eui64 "2001:db8:2:15::/64"
            }
        }
    }
    ethernet eth6 {
        ipv6 {
            address {
                eui64 "2001:db8:1:2::/64"
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
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzItMjAyNS0xIGxhYiBDQTAeFw0yNTA5MjgxNjA1NDlaFw0yNjA5MjgxNjA1NDlaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMDIucGFjMi0yMDI1LTEuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDuhkjlriXpu1qPJvS3UQN3LZseS3jOSVpV++ApGx/F87MVt1s0jgVkHEzZWjIujq4ykHj9CPLeYNpjjzEAo6WwefRE30snrVJ57x5ro2AoPSyo6/OhQx5BAvCfEPDfO38vJ2UfuWEPVQ2zCg4Eeh/3iu3K1k4+0AR90VwAToiq+7Y9XhbUyXuKXQ5ZSSFNXVp6lRLPBr144Iukv8kAPmdZqrwmbvQ4ugLSbPzl/J2wNV+Z9BPj5W+Ql5V1W6IW00AjMkfymw4GiYjvphSherJcEfRz00SwPVqOFVGpiZuoo4bSK01SrfBdVc+b04MFXvOsqNS3D8DKSDqSqP6xdcdzAgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUsOYPI1H4kWkOPbpqfa4FYYwzVMYwRwYDVR0RBEAwPoIGdnlvczAyghdjbGFiLXBhYzItMjAyNS0xLXZ5b3MwMoIVdnlvczAyLnBhYzItMjAyNS0xLmlvhwSsFBQgMA0GCSqGSIb3DQEBCwUAA4IBAQBEnZGC9bD/6z4tpDinwz0fcc+NQ8XSjUK/vHRM2oWSjaZ54TxndBbMzUB6xKYIkCn1oa6UlQ0/+X7NA538Pl6J5heGmcFrRQfGZc7de8FdHwIYm5Ee7NgyrIS2NR0w93MedRtpUAWD/fNlpZ6JRQ9B2iRjuz6OYiVriW1C8QM3D585YBlcsOtwhzMrjthYuOtJ2Qte9sdVfSZJYk1BDrZdWoB4meNlZq0LgBy/QPq77HzbaqAIf6xiuIIgzJGMugWToKTKK6uEW1+F/BTBiBeN0Y6JnPdSPMWrqW7vLgPjMEOowHs5BFlV2Qok93efr5cxnhkIfGH7+/mM3TZ/aV0+"
        private {
            key "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDuhkjlriXpu1qPJvS3UQN3LZseS3jOSVpV++ApGx/F87MVt1s0jgVkHEzZWjIujq4ykHj9CPLeYNpjjzEAo6WwefRE30snrVJ57x5ro2AoPSyo6/OhQx5BAvCfEPDfO38vJ2UfuWEPVQ2zCg4Eeh/3iu3K1k4+0AR90VwAToiq+7Y9XhbUyXuKXQ5ZSSFNXVp6lRLPBr144Iukv8kAPmdZqrwmbvQ4ugLSbPzl/J2wNV+Z9BPj5W+Ql5V1W6IW00AjMkfymw4GiYjvphSherJcEfRz00SwPVqOFVGpiZuoo4bSK01SrfBdVc+b04MFXvOsqNS3D8DKSDqSqP6xdcdzAgMBAAECggEAE//QZummJiXeXvheNmylhL2fLvgXBfzihSkcT3YFwPxA/MYl8I8j5pP04ZiNcpfmBTlV26l/a6PlS8m6yxntj5F6KLgsPgRrUOv6uf2110nhz7wQ7mmJRNwxPrUV7TG45URBV1qcx8NS5bsnF7sBqSjN7V7wqpWYetAuDZyIGwXcfWBI/yIrq0nX30aTUvYpsa+JsLiThRe7ps6KgmBUBc0+L/h4nLXGEoDw7fZ6BZyuIsI2ej2/b68mjPs8ZPLXKb+w5mM3viSOEAqsLH2yivKYzt9bel8soSouOJSdfGc+QFgA+IIMPzqr9s0eAEMmuM9YQLkiMOOun657cZ4RkQKBgQD67SQFvr/0TmY7nDXlxNDiBeqJJ48coTA606cC8oGYkZrSpzJhEPsE71PPWIF97Gfrnyw4HiQ7RCUnoCJtfC2/+Jqm9PiLO3gub8WPslHp5k0n7xWE1pNybGgeWu67fZsmxB4NYOpUVyPnqRWhotfta3q/IrPl+Wa7gEZKGMzGmQKBgQDzWPMAwsbquXKlZzFkvRO7IUNf8i6FUxaKj33+hZ2TSGYxdxmDfknJdoBldmasORPzv+Ch17ojUg6IqU0UurwLQAeMlOZiHk5rqaHNUvTWCJtkys0zQsgwU6yTqWmJPADYFZZL5MPmgVSO8YbSpTvs9ZCdVU64kqU8A9hhYsfh6wKBgF0XwbeH7zs6It+WssBN5pkUTNEZphSfEH+iqmGDiuUJkAD7Gsu8OwS3rcZNNa18GYnnAcbIF/UM8SPkWyF3YpnIJ8gtNlChfZLs0MThCVbXpGReZQNlgEqBQZeRcOSKUxdsxyF7hTRJJ/74UhgnjCh/KYjj3Q5DGwQRMQKodMBxAoGBAIKe2kEsS+2ugXV7QK4cN70Yi7uymXoDMXRKtYyrV/u4vvIKRe2pGh5Dt4O+3DnRoX4THpaA328aGqcMiU15NnqrceHqAwfj0KBFu44k2zsP/6lImoDLdf1KzLWuF/IL/T//xl8Senz+Ks9XodDr1JDK90cchVbZkEv4nGsZxMTlAoGBAIqdLbv6lPkzWg1wo6kgX2txss9AUGjk+S7C67RubuuuOrvemb9jA37v+gdjcP5gIblclV5ayNeCcj8O4a4gZKHVSvzmOT/aBXXdiO6h5S1iFasPryezqhAEPQKzkNKJO5vijGCTvQTOPUqrLyjnNjasIQgrGspJfyOh8tUd7cA4"
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
            circuit-type "level-2-only"
            network {
                point-to-point
            }
        }
        interface eth4 {
            circuit-type "level-2-only"
            network {
                point-to-point
            }
        }
        interface eth5 {
            circuit-type "level-2-only"
            network {
                point-to-point
            }
        }
        interface eth6 {
            circuit-type "level-2-only"
            network {
                point-to-point
            }
        }
        level "level-2"
        net "49.0001.0000.0000.0002.00"
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
    ssh {
        listen-address "0.0.0.0"
    }
}
system {
    config-management {
        commit-revisions "100"
    }
    host-name "vyos02"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$0Z/FPH6.8iSEwOvp$s91IAI1PrR0.6NoLuO8LMtMZRoj2LHU2mFbUxL0MHdhpJBJDwa2tJNbmA2RD1fXk/V5iUwS48RnWwmfy0.A8N."
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
