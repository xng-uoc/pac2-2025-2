interfaces {
    dummy dum0 {
        address "2001:db8::14/128"
    }
    ethernet eth0 {
        address "172.20.20.14/24"
        address "3fff:172:20:20::8/64"
        description "Management Interface"
    }
    ethernet eth1 {
        ipv6 {
            address {
                eui64 "2001:db8:1:14::/64"
            }
        }
    }
    ethernet eth2 {
        ipv6 {
            address {
                eui64 "2001:db8:2:14::/64"
            }
        }
    }
    ethernet eth3 {
        ipv6 {
            address {
                eui64 "2001:db8:0:14::/64"
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
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzItMjAyNS0xIGxhYiBDQTAeFw0yNTA5MjgxNjA1NDlaFw0yNjA5MjgxNjA1NDlaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMTQucGFjMi0yMDI1LTEuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQC39lBwtGo5y/ziA5mb2eLoUzkvzVS1HBNN540YyEXL7vs/H8vOlz8QQrd1SUbC8Xp2OBUSuUgQzsrhq6eLSXciyDMtpykjiiSpidA7SmFeJOno1LkBeLDYjr0IB+UF0ZBfapLssiE0UWjto6/zUNBj4l8bJch1qH4d+f7Uzcx731sOafX2Y2Qv91vPso6ol4OU4imSjY6EoOWm4h/RycPM97m7thlOy6f1V9mhn+3akyKCn6MGX82OZczvi1+/P1Iv8cj7Iq9HiTF+ZEg20tjhTYjDDfkXDR1HNbi8LH8cD0FDnHUi3OQk9ZwFfXMwsmT5CAv27N0KIlRU+lJMXrnrAgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUsOYPI1H4kWkOPbpqfa4FYYwzVMYwRwYDVR0RBEAwPoIGdnlvczE0ghdjbGFiLXBhYzItMjAyNS0xLXZ5b3MxNIIVdnlvczE0LnBhYzItMjAyNS0xLmlvhwSsFBQOMA0GCSqGSIb3DQEBCwUAA4IBAQAEO/WP4jkDa5G3i9d/Mc6U4cW+zwf/9N+EP54Nfg/7L5UCaxOGJz/endWM7Ec7A0pBxkl/OdV44iSimua3/f/2V9daFW3h1/2Dl/nKKDe7aUONoifa6QbBW3PExr9LrBLlPfa/u8UKWMwggbtZwHbhFXKFmkEr6cXfGl7b6sHXT0UCy0WJUhuJFqojbdAA0vgidryUbMBuTmodlBQ9HOTdeeMpzP+26TalrYZgPa/eBRgl0oHIxWqyXg0QkpW3I2bVtJRbrALw5kRgZksw+pFXs67Ll3uTct9LSVpyBV4Z1b3JR+A+fgIKfEN0inHCZd06SIV+qm5M2QcCsRFMakY6"
        private {
            key "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC39lBwtGo5y/ziA5mb2eLoUzkvzVS1HBNN540YyEXL7vs/H8vOlz8QQrd1SUbC8Xp2OBUSuUgQzsrhq6eLSXciyDMtpykjiiSpidA7SmFeJOno1LkBeLDYjr0IB+UF0ZBfapLssiE0UWjto6/zUNBj4l8bJch1qH4d+f7Uzcx731sOafX2Y2Qv91vPso6ol4OU4imSjY6EoOWm4h/RycPM97m7thlOy6f1V9mhn+3akyKCn6MGX82OZczvi1+/P1Iv8cj7Iq9HiTF+ZEg20tjhTYjDDfkXDR1HNbi8LH8cD0FDnHUi3OQk9ZwFfXMwsmT5CAv27N0KIlRU+lJMXrnrAgMBAAECggEADsLzmnpHqdfzX1l679VwjpmbAE8hfx+VHE5lH+TLgP1DaOx5aLGclwabfQxXuBiIw0gQcikESOD8c6utV+ZvFQ9BLWZ5TRzugIeKpNn87SvYydzuntkbQQ1XICKuCc+n85ge2Q0Zeqlrr4ylIkj3p9mILdVUJr4nUerNEYYVZKfD6kuFnTEKrgJBO7hngO9DPl6emtgoohht8ktwFnMd7r8aXUzKzYhE7WQfen+IKfYanmcSzayPljyPxK0MNrrcJH7OkVSUm07mjwdL1gNL8F05g8ws1xEtFm+piXeO6v0UOZEgG/UhCXfbPcz76YUCrY8m7GY9V0bZ9/fcljOYPQKBgQDeyk3yfDHCDuptzYQz3M2uTkpVdMA1Toxfq46PhRHJhXWyNU/MqO3LBR6OUsUXyuzyVzTndKbq6ySwkrrn/yfjwf0zBdVouhb8i41+vGJF9ewsWUX+X+Ug9GmXgs64wSVVv0w1nJah6L53BWN5bgu4TwWHUbEsm3YU43tmOiykxwKBgQDTYlOYJuDrhyj1JkMx7c2CBLYb2SBM3+4D9GUouvgJxCa9qnrm+uxfJDYrNK5DAd4ofGcpMVFtd3nGKb3ir9IZ3Pj8/ajUWstScapjrGEDzwQpMVHA1uDnwj8GJMMNEZPV0qOF3wXQlkdSB6Tdkw/g6Rt96KveYJhPPZx1yrVVvQKBgFtuiy7I6WLK3ErT3T2rkH3Ig5kuoPM/mTxqG8eqxPH/Y54PYwCLE4wOPcwLC/gHv9Z1E7EpnpcqiZQto6cygBxosJEQA9VHCcf7PcaVaX9svdA1kxQiJtavd+ZGOLB6E+hs6cnWybsI2aHfBEQBda3eQFaYoC2+X2eTNEFv/oJhAoGAdVMS4NVba362XfLhwtmhgfPJfAV0Zxa3DdzdNNEpkIodkpIH6yIEhf4cTrjLrAdiXghGXdewwVhZ74IFkcdSjuZWEF1eEpdeWKEcGHx50Fpbjd2A6c6aQChRQMCwvhUuf7SM7GXP3Wk7pqz1dcIFQyk/CBBXLHNitkCVEc/z++UCgYAeRdQVDHtkfgeVnSmBYS+96jPW3sqeWxFNdOXVSQpf9ENHagUqU9bfp8EPpp0Akbqh4IdLbVkOssHgH04dOebiEbjnzp0wqi2tx/H33lhTAphNB7ggyTagldGsQmud8+eZSO1VJcWcJIIIK1h9ZG/r9VyFqeM8SJM6tLzihhkDJg=="
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
        net "49.0001.0000.0000.0014.00"
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
            prefix 2001:db8:0:14::/64 {
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
    host-name "vyos14"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$b6550kCw9S4yhppj$mmywNo.QumW7c75lv6xFQvSFphTdx2.W4WQPwHOt8/hgMic9cxUwdaEGBveCop1khoFBCXYdK0a.Rts5IBODm/"
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
