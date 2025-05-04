#!/bin/bash

# Exit if any command fails
set -e

echo "íº€ Updating system packages..."
sudo yum update -y

echo "íº€ Installing required packages..."
sudo yum install -y yum-utils device-mapper-persistent-data lvm2

echo "íº€ Adding Docker repository..."
sudo yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo

echo "íº€ Installing Docker..."
sudo yum install -y docker-ce docker-ce-cli containerd.io

echo "íº€ Enabling and starting Docker service..."
sudo systemctl enable docker
sudo systemctl start docker

echo "íº€ Adding user '$USER' to the docker group..."
sudo usermod -aG docker $USER

echo "âœ… Docker installation complete!"

echo "íº€ Verifying Docker version..."
docker --version

echo "âš¡ You may need to log out and log back in to apply group changes."

