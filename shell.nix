with import <nixpkgs> {};

stdenv.mkDerivation {
	name = "steem-comments-client-shell";
	buildInputs = [ pkgs.scala pkgs.sbt ];
}
