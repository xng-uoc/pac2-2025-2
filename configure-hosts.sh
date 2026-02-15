#!/bin/sh

clab_name="clab-pac2-2025-2"

# Remove the default routes to ensure that routers and hosts are isolated
printf "Removing default routes from routers and hosts..."
sudo docker exec -d $clab_name-vyos01 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-vyos02 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-vyos11 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-vyos12 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-vyos13 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-vyos14 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-vyos15 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-host11 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-host12 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-host13 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-host14 ip route del default via 172.20.20.1
sudo docker exec -d $clab_name-host15 ip route del default via 172.20.20.1

sudo docker exec -d $clab_name-vyos01 ip -6 route del default
sudo docker exec -d $clab_name-vyos02 ip -6 route del default
sudo docker exec -d $clab_name-vyos11 ip -6 route del default
sudo docker exec -d $clab_name-vyos12 ip -6 route del default
sudo docker exec -d $clab_name-vyos13 ip -6 route del default
sudo docker exec -d $clab_name-vyos14 ip -6 route del default
sudo docker exec -d $clab_name-vyos15 ip -6 route del default
sudo docker exec -d $clab_name-host11 ip -6 route del default
sudo docker exec -d $clab_name-host12 ip -6 route del default
sudo docker exec -d $clab_name-host13 ip -6 route del default
sudo docker exec -d $clab_name-host14 ip -6 route del default
sudo docker exec -d $clab_name-host15 ip -6 route del default
printf " done!\n"
