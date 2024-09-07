package de.phl.programmingproject;

import org.junit.jupiter.api.Test;

/**
 * Test class for the 'Objects and Classes' exercise.
 */
public class ObjectsAndClassesTest {
    @Test
    void cookie_caper_markdown_file_exists_in_root_directory() {
        // check that the file 'cookie_caper.md' exists in the root directory of the project
        // (i.e. in the root or  'src' directory)
       TestUtils.assertFileExistsInRootOurSrcDirectory("cookie_caper.md");}

    @Test
    void farmers_market_markdown_file_exists_in_root_directory() {
        // check that the file 'farmers_market.md' exists in the root directory of the project
        // (i.e. in the root or  'src' directory)
        TestUtils.assertFileExistsInRootOurSrcDirectory("farmers_market.md");
    }

    @Test
    void alien_invasion_markdown_file_exists_in_root_directory() {
        // check that the file 'alien_invasion.md' exists in the root directory of the project
        // (i.e. in the root or  'src' directory)
        TestUtils.assertFileExistsInRootOurSrcDirectory("alien_invasion.md");
    }

    @Test
    void farmyard_frenzy_markdown_file_exists_in_root_directory() {
        // check that the file 'farmyard_frenzy.md' exists in the root directory of the project
        // (i.e. in the root or  'src' directory)
        TestUtils.assertFileExistsInRootOurSrcDirectory("farmyard_frenzy.md");
 }
}
