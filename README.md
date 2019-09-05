# Google Cloud Build Demo

## Build the project without Docker daemon

```bash
$ mvn clean install jib:build -Dimage=eu.gcr.io/learning-cloud-build-251912/cloud-build-demo
```

## Build with Docker daemon

```bash
$ mvn clean install jib:dockerBuild -Dimage=altfatterz/docker-jib-demo
```

## Start a new build

```bash
$ gcloud builds submit
```

## Building and debugging locally

https://cloud.google.com/cloud-build/docs/build-debug-locally