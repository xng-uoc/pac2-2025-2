interfaces {
    dummy dum0 {
        address "2001:db8::11/128"
    }
    ethernet eth0 {
        address "172.20.20.11/24"
        address "3fff:172:20:20::6/64"
        description "Management Interface"
    }
    ethernet eth1 {
        ipv6 {
            address {
                eui64 "2001:db8:1:11::/64"
            }
        }
    }
    ethernet eth2 {
        ipv6 {
            address {
                eui64 "2001:db8:2:11::/64"
            }
        }
    }
    ethernet eth3 {
        ipv6 {
            address {
                eui64 "2001:db8:0:11::/64"
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
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzItMjAyNS0xIGxhYiBDQTAeFw0yNTA5MjgxNjA1NDlaFw0yNjA5MjgxNjA1NDlaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMTEucGFjMi0yMDI1LTEuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDahvR5cDwPLBg2l3VxGSFK2GwD7XXVxerZ0T6qXiwuTv8M2uA9NwA8Z2W5jP6ygBuhcZcg33zbqZ1Tg6G4oAbhz8e4arNGpTtHzmWacH4wHCLyYwWqZwreMwWmfgwZ+9myluOfyN3VPnN3s0ID8XFs0bf2ZTN9JLz5WFpx7l9EOBfxO2kxJsAod6PlE2OA78d+pHsfI9rdql+vPRRODAUtewvgKQxx9TPYvyzXr0FeCLHlvU7UoXr95TcVI4p79ORGwD8tSR9BWLNVi5/gGxQeceEFEn5U9iPDZvlxOH0ccKrhyf+m6I8x0qQKeOqa7PQvRWfJJbODutRqzxLq1WcLAgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUsOYPI1H4kWkOPbpqfa4FYYwzVMYwRwYDVR0RBEAwPoIGdnlvczExghdjbGFiLXBhYzItMjAyNS0xLXZ5b3MxMYIVdnlvczExLnBhYzItMjAyNS0xLmlvhwSsFBQLMA0GCSqGSIb3DQEBCwUAA4IBAQDW7v/RZ+fD7YwPXjvEtbqP63xmZq84zt2acptz04y7UJzqtzgpQIyVM2tgJrIRcZMzMjsIAI/LGWyMEFlzoQ6eSXiv1FJyu6U/QmPvxd1r1lqI3zI1ei4PNNc2YD3DdBb6M2Fn19tilH0IjuYAsOlzz0RsOaF5Ne7d2Ei3VhJah63WoFzZQ0RgmaTjrWvdjEktikQ/jvOMUSzrrJUb9EGNPqL+WI9T22K5zLIZebrtgH21klnirZS8wwOIagt3+CQ6lRy/v1thRWB6fqMN1jbt/ytEunsn0Q4ycPv5RtdynCxVFtoY6nsx0Ia2MI3tehooreTBNjI8iOiGwkikC4MQ"
        private {
            key "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDahvR5cDwPLBg2l3VxGSFK2GwD7XXVxerZ0T6qXiwuTv8M2uA9NwA8Z2W5jP6ygBuhcZcg33zbqZ1Tg6G4oAbhz8e4arNGpTtHzmWacH4wHCLyYwWqZwreMwWmfgwZ+9myluOfyN3VPnN3s0ID8XFs0bf2ZTN9JLz5WFpx7l9EOBfxO2kxJsAod6PlE2OA78d+pHsfI9rdql+vPRRODAUtewvgKQxx9TPYvyzXr0FeCLHlvU7UoXr95TcVI4p79ORGwD8tSR9BWLNVi5/gGxQeceEFEn5U9iPDZvlxOH0ccKrhyf+m6I8x0qQKeOqa7PQvRWfJJbODutRqzxLq1WcLAgMBAAECggEAIHoBt6c48yOhU5et117zO4gvgWPsk8EuwSwKTU/imV1EesNv+QOwEB9pFwA/0q/HAMwnYuDOpxIC9NLxbsVa+yX3RM6YEdiOQgKIHMGO12qPEl5/YeRKJrIG1cgSLK2+calgGd1Eg/kcjakWl2HDcsyLiQhgSb8d1fbOC57wCeyqarJyeZI1rnp+6Y3iNwLzI3jtOw2GaTfjhcYpnYLo52uu3Mnrot9Rd6y1D9UIgqkALYfMK7weHaGlvMGFZd6n0O/YnVPhICN3Uv/IsyVgu3Actts8budBd0KBb1gIHtBtuJA28gV4lqKQHu1Za9va3HDAfG6lYhUFLcBlEX1V4QKBgQD9ghmFPxTrxsJHpujNQBDI1dA00ngUTQqvtu+qGhsFtoOnr2stcq532dc6LlrTTKJX5etg0BWB6ioS0U+G6svulP3ereKtiTgBF2vcjjApfV71ubDHkEJlAQU4datsj4LOrnFibbcyAKp4GnU+EDRX936jk67sVVrC5sGqwbOcawKBgQDcrNU1DXYXYyddaCJC0pNR2G6OJrb+0sxt41zLNj61TzN3/vl/dgBis3Zng42Wl7Abs5JCu+mhaNyc+LcjGgpTUJ1KBBt5qS7WgsiHz5ZY32xXZ66RqAWCP8l9rrcuV8cQd1XXSpKwq8e0C0+V7G7HD75C3IC/tMe1GWLmVJYH4QKBgQDerM556kUYLUgt5ACNeX7EynrOSylKu7ltSwUNp0yhIgZW3pEIJLn3cJPK+TiybZgUGVM9gMnDicpXKR/v5IIpGRo95QM9Z1CYNNh7rTHE3+jvcqJDSQXo7pKFW2auPwipPzU9Ph4yf789LBBb6aPwuOa2DF0UHo1QsZzfvrFj7QKBgDuFjriRmfGy9/I03VDi1YO0+hTzklZna2aUdfoF9qIW684JAykDHhWBTIWdMTqWTZUbOW8wmlLEIwVf/J3GL1TLoLFPLE4DeTO48PfY4Te1g9aLi8WT6XB5XhK9ZoFkgbgKSCga4DgxDVud1Wid7j9ZGruUGFIdI+TQJSH1XMZhAoGBAJY/LMZUNfASd+ETX71sTKRog4oYOQeQIChprDFMUh+u//UhsufcZpmU4KSZXXkioaSYSykuBGWJgcYLP5IPh6En9AsoEtmi2fgqA+LBzoRS4VePqIBFxAnj8XGbrfqlCTMDqIQZRDpOCBLJoe5W24L6VAVHx9jcDPiF5dTTW+mB"
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
        net "49.0001.0000.0000.0011.00"
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
            prefix 2001:db8:0:11::/64 {
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
    host-name "vyos11"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$eRMVQe7Hd6NdcSDm$s.vKe01.WSTSOMOKJdfUs0l8psvJx6GokOiaNPZTbzf.lsKG0jsKVdhrmuSKzAV.seH3lJh8qSQFOuGt2sigv."
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
