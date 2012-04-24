package hudson.plugins.dry.parser.simian;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Java Bean class for a Simian duplication set.
 *
 * @author Ulli Hafner
 */
public class Set {
    private int lineCount;
    private final List<Block> blocks = new ArrayList<Block>();

    /**
     * Adds a new block to this duplication set.
     *
     * @param block
     *            the new block
     */
    public void addBlock(final Block block) {
        blocks.add(block);
    }

    /**
     * Returns all blocks of this duplication set. The returned collection is
     * read-only.
     *
     * @return all files
     */
    public Collection<Block> getBlocks() {
        return Collections.unmodifiableCollection(blocks);
    }

    /**
     * Returns the number of duplicated lines.
     *
     * @return the lineCount
     */
    public int getLineCount() {
        return lineCount;
    }

    /**
     * Sets the number of duplicated lines to the specified value.
     *
     * @param value the value to set
     */
    public void setLineCount(final int value) {
        lineCount = value;
    }
}

