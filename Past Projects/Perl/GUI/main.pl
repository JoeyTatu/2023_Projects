use Atlas;

my $BODY = '
<fieldset>
    <input id="input" value="World"/>
    <button>Hello</button>
    <hr/>
    <fieldset>
        <output>Greetings displayed here!</output>
    </fieldset>
</fieldset>
';

sub acConnect {
    my ($hello, $dom) = @_;

    $dom->inner("", $BODY);
    $dom->focus("input");
}

my %CALLBACKS = (
    "" => \&acConnect
);

Atlas:Launch(\CALLBACKS);