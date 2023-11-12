# start using minikube docker daemon
eval $(minikube docker-env)

# MINIKUBE_IP=$(minikube ip)
MINIKUBE_IP=localhost


# Docker image details
DOCKER_IMAGE_NAME="catalog-search-serv"
DOCKER_IMAGE_TAG="1"

docker build -t $DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG .

# Tag the Docker image
docker tag $DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG $MINIKUBE_IP:5000/$DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG

# Push the Docker image to Minikube registry
docker push $MINIKUBE_IP:5000/$DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG

# Print Minikube registry URL
echo "Minikube Registry URL: $MINIKUBE_IP:5000/$DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG"

curl http://$MINIKUBE_IP:5000/v2/_catalog

docker pull $MINIKUBE_IP:5000/$DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG

# end usign minikube docker daemon
eval $(minikube docker-env -u)
