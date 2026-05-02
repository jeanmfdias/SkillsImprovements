public class GitHubUser {
    private String login;
    private String name;
    private String bio;
    private String location;
    private int publicRepos;
    private int followers;
    private int following;

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getPublicRepos() { return publicRepos; }
    public void setPublicRepos(int publicRepos) { this.publicRepos = publicRepos; }

    public int getFollowers() { return followers; }
    public void setFollowers(int followers) { this.followers = followers; }

    public int getFollowing() { return following; }
    public void setFollowing(int following) { this.following = following; }

    public void details() {
        System.out.println("GitHub user: " + login);
        System.out.println("Name: " + (name == null ? "(no name)" : name));
        System.out.println("Bio: " + (bio == null ? "(no bio)" : bio));
        System.out.println("Location: " + (location == null ? "(no location)" : location));
        System.out.println("Public repos: " + publicRepos);
        System.out.println("Followers: " + followers);
        System.out.println("Following: " + following);
    }
}
