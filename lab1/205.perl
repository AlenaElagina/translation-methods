while(<>) {
	s/(\W*)(\w)(\w)(\w*)/$1$3$2$4/g;
	print;
}