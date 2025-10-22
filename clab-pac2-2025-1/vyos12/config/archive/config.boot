interfaces {
    dummy dum0 {
        address "2001:db8::12/128"
    }
    ethernet eth0 {
        address "172.20.20.12/24"
        address "3fff:172:20:20::3/64"
        description "Management Interface"
    }
    ethernet eth1 {
        ipv6 {
            address {
                eui64 "2001:db8:1:12::/64"
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
                eui64 "2001:db8:0:12::/64"
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
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzItMjAyNS0xIGxhYiBDQTAeFw0yNTA5MjgxNjA1NDlaFw0yNjA5MjgxNjA1NDlaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMTIucGFjMi0yMDI1LTEuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCg7ySkMdTYtqll29d4XD2dJ/Q0eMKe58RgMeuFvvwGYbkueYVaOnqpjPM2VVSsE/Vsps7KCjYdBy1Bu0HNQs3KYabRA4gzGeJdMSPcJVUABQk+EJ/62YWlEwPv3FdrLg4FSWVfJeZXum69DmSKK2JsJL6XybeebQe9xx6UDMCQOB8caDwDFD/wTie4oP2VSOeSMaC8dIpMKxRhWyWmmO7XCPUd894CR5VBoorUuZHOU3GY4ul+4PrJ+mxpAq+6cSx9WH/1VZ7veK4OCD3i2AixtMyJPH3iI4N7uQ2WBkFhosWOGeACYpuou68AVVVTC6euhxYiNeyJJVGYbHt7xmynAgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUsOYPI1H4kWkOPbpqfa4FYYwzVMYwRwYDVR0RBEAwPoIGdnlvczEyghdjbGFiLXBhYzItMjAyNS0xLXZ5b3MxMoIVdnlvczEyLnBhYzItMjAyNS0xLmlvhwSsFBQMMA0GCSqGSIb3DQEBCwUAA4IBAQADcONGM9375cN/TlC15daaRv8qp8rb4Wpq0wLDcEMeTZXunjCtbFzZpafDZB49l2CWCEvqnY2ovSiKnKKfDXBKAOdWd1NWE2Yr26EXRhhnwuhg7Q4Ak5OQF4u7SpXHEQnVUOu4kWgvyNvT5PX3Vwn77Q+l/LBOsk2lo2echTR/V574FeDnLfwT8On1SZhEf4ac+4tXkGJv0za/sn6oGH+FNt+toYX4HEN3mS6vV9l3QzJfN/u6xbaywy/g8GHwdTBGYefnKz7/FUsvr6Q5fs4HxROEZ0YXBHNGLmBQPpZ8Wa+c/kyy/qa/z9HJ9K8FOd3WWsyBFf7YdZEXJlvApW1j"
        private {
            key "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCg7ySkMdTYtqll29d4XD2dJ/Q0eMKe58RgMeuFvvwGYbkueYVaOnqpjPM2VVSsE/Vsps7KCjYdBy1Bu0HNQs3KYabRA4gzGeJdMSPcJVUABQk+EJ/62YWlEwPv3FdrLg4FSWVfJeZXum69DmSKK2JsJL6XybeebQe9xx6UDMCQOB8caDwDFD/wTie4oP2VSOeSMaC8dIpMKxRhWyWmmO7XCPUd894CR5VBoorUuZHOU3GY4ul+4PrJ+mxpAq+6cSx9WH/1VZ7veK4OCD3i2AixtMyJPH3iI4N7uQ2WBkFhosWOGeACYpuou68AVVVTC6euhxYiNeyJJVGYbHt7xmynAgMBAAECggEACKONtfqu0EtN4JfigyWAcTU52K8600jhs8A6Ql20LauFQ0dmrydAemWEkMAX4XzYydJSe2n86aX++e5RY/FYFqsTR1kHMKcNDa+bmy+t1mhuzJQb4l1W3TueFHwhfTFls0bzWB4ytTbexutE3l3h1KhMSt2bK7fymG9d5tigZZ1n03cUVly73QEbfD4EJqUxILsBWSLXrUI+snAb9Ow4mN3ZPqSqPJwA5903HHJZ+vG+FaGMfEGKXWYXAMmOokg6Fue1F0mwkJJDTBortB2OJ/ru6cS4X/Z+ZLY2wck9tNBlvzAwwmOyGnjL3cWFKJM3CkI2oOLU4B3uYop9neCZYQKBgQDK2AnTFeIZeMQeds4hf9zfP9nD46tadIU7In9QD1i0WB3Y0xNdaheRdtkx0vtvTeG9tZvEf/DXqVXyknxecSapHDSqxtVnJfzKUXeK0RvscVwrP8ftcNzyJd+1+YYIL3biKf5s5MieJ7azLwSoBCVLxHSAv7udR2W4AVvG9sMP/wKBgQDLG41uyeXfUXu85bwglWWlN2i9QUSLFjwL18J7bZ1DANnIkqIl+kMdj9XK/LAh00ZnPDpUKgPilg7Vm6/Wdu1XosrDpQ6QZnVZmF18CQ529HEpKutP63a28RfQ/UiFBFHVKJZJcyTxREPUxbeBDtYWPYUOiYVjRZ6GyAwumTojWQKBgQC+mxlISCTpCIlJkxwJcIwNIIOxxisLWbikI7t8cJ9LAA4z48wrmHjDEOnxHq90HLwGNzRDBnI7RPzlbu79E9hfSojW/PYk8hZDyx/IyswxdyhD37Avl0GXLS21Yt6mrGtLBGj2zFkT/H96irEWbKbbNqS/IuvaU+/qYyRppxEO4wKBgEYRdkRfMIdPJAHxu2n+QDe0GtUXfB8Dh6mKQJS2Jwejdn5kX738TUUYhuflLposueAJfhHlALwdinaUpB+3nX+bMJo4CgM05Y0ILFALC8tr3tIV9WH32Feaat31UxxYdia0PsyOBZOaOlBf+UNzq9W2WX2/YZ3yuZLD1rgIsm7ZAoGAOJmTiAcsa9UpPkD28mHwSBZrJUxVkIi7jpaf9LZdxcpyz0W6kPAGatPeCRYHiYNeMFeFj1FbNTb7sICWuBWrpAfOky2idFl8sLiuzwgFLNbIMOJB6qQoDnElb6dA7GLk+5br9iwG1iHqLmuVpt7vEw1soYbyUDPpp7kNTKLdKv4="
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
        net "49.0001.0000.0000.0012.00"
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
            prefix 2001:db8:0:12::/64 {
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
    host-name "vyos12"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$/Z8SlvkrAO7vZpKM$woGoE4yq1C9Rpbn7asM87U9vzKWKnojFN1cDO0BCQGS5DAaHJbQaMNzTkT2o/X2nDizDBsQG53YmTV.ig9hcB/"
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
