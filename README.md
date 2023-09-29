# CSC207group156
## Group Members:
//note: I think should we put our full names since this is an official submission
- (Abhi?)
- Ethan Fine
- Aria Coventry
- Wilson
- Mahek Cheema

## Problem Domain
The goal of our group's project is to develop a YouTube-Spotify Playlist Converter. This project will facilitate 
seamless playlist transfers from YouTube to Spotify and Spotify to YouTube. Also, it will feature several other side tools for managing your playlist. As a result, the problem domain primarily involves media streaming 
and playlist management.

## Application Description
For customers who want to transfer their YouTube playlists to Spotify or Spotify playlists to YouTube, our program strives to offer a simple and 
effective alternative. The application's fundamental features will consist of:
- **Playlist Retrieval:** Users provide a YouTube/Spotify playlist URL, and the application will extract the list of songs from that playlist and create a playlist object.
- **Account Authentication:** User account authentication will be used to create playlists on behalf of the user.
- **Playlist Creation:** Our application will create a new Spotify/YouTube playlist for the user, depending on the application selected.
- **Song Retrieval:** Use a song+creator matching algorithm to search and match songs or podcasts from the YouTube playlist to the Spotify database, or from the Spotify playlist to YouTube's catalog.
- **Playlist Creation:** Retrieved songs will be added to the newly created Spotify/YouTube playlist, or the users can export the playlist object as a save file.
- **Other side tools:** Other possible features we may add are reordering playlist, sorting, downloading mp3s, prompting user to answer doubt if a song+creator address was not found in the other site

## API usage documentation links
- **Spotify API:** (for PUT/GET requests for the user's spotify account)
https://developer.spotify.com/documentation/web-api
- **Youtube API:** (for PUT/GET requests for the user's youtube account)
https://developers.google.com/youtube/v3/getting-started
- **MusicAPI API:** (for GET requests to get youtube/spotify song data URLs to translate into a media object)
https://musicapi.com/docs/intro/
