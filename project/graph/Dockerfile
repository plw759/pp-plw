# Stage 3: Final image with Pharo VM and application
FROM debian:12-slim as final

# Install required dependencies
RUN apt-get update && \
    apt-get install -y \
    ca-certificates \
    libcurl4-gnutls-dev \
    wget \
    libssl-dev \
    curl \
    unzip \
    xvfb \
    && rm -rf /var/lib/apt/lists/*

RUN curl https://get.pharo.org | bash

# Download and extract Pharo VM
WORKDIR /opt/pharo
ADD https://files.pharo.org/get-files/110/pharo-vm-Linux-x86_64-stable.zip ./pharo-vm.zip
RUN unzip pharo-vm.zip && rm pharo-vm.zip
ENV PHARO_VM /opt/pharo/pharo-vm

# Download and extract Pharo image
ADD https://files.pharo.org/get-files/110/pharoImage-x86_64.zip ./pharo-image.zip
RUN unzip pharo-image.zip && rm pharo-image.zip
ENV PHARO_IMAGE /opt/pharo/Pharo.image



# Set the Pharo environment variables
ENV PHARO_VM_PARAMETERS="-vm-display-x11"
ENV DISPLAY=:1

# Copy your script and custom classes into the image
COPY graph-visualizer /opt/pharo/graph-visualizer

# Create a non-root user
RUN useradd --uid 1000 --gid 100 --home-dir /opt/pharo --no-create-home --no-user-group pharo
RUN chown pharo: /opt/pharo

# Switch to the non-root user
USER pharo

# Run your script
#CMD ["/opt/pharo/pharo", "Pharo.image", "/opt/pharo/graph-visualizer/graph-visualizer.st"]
#CMD ["/opt/pharo/pharo-ui"]

