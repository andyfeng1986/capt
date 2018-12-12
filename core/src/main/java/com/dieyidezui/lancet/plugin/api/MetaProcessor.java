package com.dieyidezui.lancet.plugin.api;

import com.dieyidezui.lancet.plugin.api.annotations.Meta;
import com.dieyidezui.lancet.plugin.api.graph.ClassInfo;

import javax.annotation.Nullable;

/**
 * Only class contains plugin interested annotations will pass to MetaProcessor
 */
public abstract class MetaProcessor {

    /**
     * Class changed, pre has {@link Meta}, but current removed.
     *
     * @param basicInfo info
     * @return class consumer
     */
    @Nullable
    public ClassConsumer onMetaRemoved(ClassInfo basicInfo) {
        return null;
    }

    /**
     * Class changed, pre doesn't have {@link Meta}, but current got.
     *
     * @param basicInfo info
     * @return class consumer
     */
    @Nullable
    public ClassConsumer onMetaAdded(ClassInfo basicInfo) {
        return null;
    }

    /**
     * Class changed, both have {@link Meta}
     *
     * @param basicInfo info
     * @return class consumer
     */
    @Nullable
    public ClassConsumer onMetaChanged(ClassInfo basicInfo) {
        return null;
    }

    /**
     * Class removed, pre has {@link Meta}.
     *
     * @param basicInfo last info
     */
    public void onMetaClassRemoved(ClassInfo basicInfo) {
    }

    /**
     * Class added, current has {@link Meta}.
     *
     * @param basicInfo
     * @return class consumer
     */
    @Nullable
    public ClassConsumer onMetaClassAdded(ClassInfo basicInfo) {
        return null;
    }

    /**
     * Class not changed, both have {@link Meta}.
     *
     * @param basicInfo info
     * @return class consumer
     */
    @Nullable
    public ClassConsumer onMetaClassNotChanged(ClassInfo basicInfo) {
        return null;
    }

    /**
     * After parse every meta class, tell lancet which classes require to transform.
     *
     * @return class request
     */
    public abstract ClassRequest onProcessEnd();
}
