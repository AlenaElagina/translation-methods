my $m=0;
my $k=0;
my $n=0;

while(<>) {
	s/<.*?>//g;
	if (/\S/){$k=1;}
	if ($k==1) {
		if ($n==0 && /^\s+$/) {
		$n=1;
		$m=1;
		}
		elsif ($n==1 && /^\s+$/) {
		print "";
		}
		else {
		if ($m==1){
		print "\n";
		$m=0;
		}
		$n=0;
		s/^\s+//;
		s/\s+$//;
		s/\s\s+/ /g;
		print;
		print "\n";
		}
	}
}