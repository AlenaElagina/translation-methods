#!/usr/bin/env perl

my @arr = ();
while (<>) {
	# if (/<a href="(.*?)">/) {
 #        print "$1\n\n";
 #    }
	if (/<a(.*?)href(.*?)=(.*?)(\"|')(((.*?):\/\/)|)(.*?)(\/|:|\"|')(.*)/) {
	    my $tmp = $8;
	    if ($tmp =~ /.+\.[^.]+/) {
		    push(@arr, $tmp);
	    }
	}
}

# for (@arr) {
# 	s/:(.*?)$//;
# }

my @ans;
foreach my $item (@arr) {

    push(@ans, $item) unless $seen{$item}++;
}

foreach my $item (sort @ans) {
	print "$item\n";
}