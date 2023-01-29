while(<>) {
	print if /.*\b[0-9]+(\W*\d*)*\b.*/
}