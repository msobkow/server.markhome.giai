#!/bin/bash
echo "Installing rust toolchain and debian 13 specific rust support tools and libraries"
sudo apt install rustup rustc cargo clippy rustfmt
sudo apt install build-essential bindgen pkg-config
sudo apt install rust-analyzer
sudo apt install cargo-deb debcargo dh-cargo
sudo apt install sbuild
sudo apt install dpkg-dev liblzma-dev
sudo apt install musl-tools
sudo apt install mimalloc jemallocator
sudo apt install cargo-dist
