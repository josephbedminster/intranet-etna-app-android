package io.etna.intranet.Curl;

/**
 * Created by thomasrolland on 13/04/2017.
 */

public interface NetworkInterface {
    /**
     * Get string by username password
     * @param endpoint rest url
     * @param username username
     * @param password password
     * @return String
     */
    String getString(String endpoint, String username, String password);


    /**
     * Get string by bear token
     * @param endpoint rest url
     * @param token bearer token
     * @return String
     */
    String getString(String endpoint, String token);

    /**
     * Search call
     *
     * @param get
     * @param query search query
     * @return String
     */
    String search(String[] get, String[] query, String urle, String[] path);
}