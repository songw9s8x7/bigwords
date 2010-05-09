package com.forusers.android.worditerator;

public class ESTWordIteratorImpl implements WordIterator {
    static final String text = "Eastern Standard Tribe\n"
        + "\n"
        + "I once had a Tai Chi instructor who explained the difference between Chinese and Western medicine thus: \"Western medicine is based on corpses, things that you discover by cutting up dead bodies and pulling them apart. Chinese medicine is based on living flesh, things observed from vital, moving humans.\" \n"
        + "The explanation, like all good propaganda, is stirring and stilted, and not particularly accurate, and gummy as the hook from a top-40 song, sticky in your mind in the sleep-deprived noontime when the world takes on a hallucinatory hypperreal clarity. Like now as I sit here in my underwear on the roof of a sanatorium in the back woods off Route 128, far enough from the perpetual construction of Boston that it's merely a cloud of dust like a herd of distant buffalo charging the plains. Like now as I sit here with a pencil up my nose, thinking about homebrew lobotomies and wouldn't it be nice if I gave myself one.\n"
        + "\n"
        + "Deep breath.\n"
        + "\n"
        + "The difference between Chinese medicine and Western medicine is the dissection versus the observation of the thing in motion. The difference between reading a story and studying a story is the difference between living the story and killing the story and looking at its guts.\n"
        + "\n"
        + "School! We sat in English class and we dissected the stories that I'd escaped into, laid open their abdomens and tagged their organs, covered their genitals with polite sterile drapes, recorded dutiful notes *en masse* that told us what the story was about, but never what the story *was*. Stories are propaganda, virii that slide past your critical immune system and insert themselves directly into your emotions. Kill them and cut them open and they're as naked as a nightclub in daylight.\n"
        + "\n"
        + "The theme. The first step in dissecting a story is euthanizing it: \"What is the theme of this story?\" \n"
        + "\n"
        + "Let me kill my story before I start it, so that I can dissect it and understand it. The theme of this story is: \"Would you rather be smart or happy?\"";

    public ESTWordIteratorImpl() {
    }

    public boolean open(String fname) {
        index = 0;
        return true;
    }

    public void close() {
    }

    public String nextWord() {
        index++;
        return String.format("Word%03d", index);
    }

    public void gotoIndex(int word) {
        index = word;
    }

    public int getWordIndex() {
        return index;
    }

    private int index;

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String next() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub
        
    }
}
