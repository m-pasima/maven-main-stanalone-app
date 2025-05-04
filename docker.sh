#!/bin/bash

# Exit if any command fails
set -e

echo "� Updating system packages..."
sudo yum update -y

echo "� Installing required packages..."
sudo yum install -y yum-utils device-mapper-persistent-data lvm2

echo "� Adding Docker repository..."
sudo yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo

echo "� Installing Docker..."
sudo yum install -y docker-ce docker-ce-cli containerd.io

echo "� Enabling and starting Docker service..."
sudo systemctl enable docker
sudo systemctl start docker

echo "� Adding user '$USER' to the docker group..."
sudo usermod -aG docker $USER

echo "✅ Docker installation complete!"

echo "� Verifying Docker version..."
docker --version

echo "⚡ You may need to log out and log back in to apply group changes."

