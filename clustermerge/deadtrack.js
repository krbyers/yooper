/**
 * 
 */
var ITTrackKindFile = 1;
var iTunesApp = WScript.CreateObject("iTunes.Application");
var deletedTracks = 0;
var mainLibrary = iTunesApp.LibraryPlaylist;
var tracks = mainLibrary.Tracks;
var numTracks = tracks.Count;
var i;
while (numTracks != 0) {
	var currTrack = tracks.Item(numTracks);
	// is this a file track?
	if (currTrack.Kind == ITTrackKindFile) {
		// yes, does it have an empty location?
		if (currTrack.Location == "") {
			// yes, delete it
			currTrack.Delete();
			deletedTracks++;
		}
	}
	numTracks--;
}
if (deletedTracks > 0) {
	if (deletedTracks == 1) {
		WScript.Echo("Removed 1 dead track.");
	} else {
		WScript.Echo("Removed " + deletedTracks + " dead tracks.");
	}
} else {
	WScript.Echo("No dead tracks were found.");
}