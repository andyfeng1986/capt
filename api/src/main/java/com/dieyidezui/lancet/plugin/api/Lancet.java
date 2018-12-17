package com.dieyidezui.lancet.plugin.api;

import com.dieyidezui.lancet.plugin.api.process.MetaProcessor;
import com.dieyidezui.lancet.plugin.api.transform.ClassTransformer;

import java.lang.annotation.Annotation;

public interface Lancet {

    boolean isIncremental();

    Context getContext();

    Arguments getArgs();

    void registerMetaProcessor(MetaProcessor processor, Class<? extends Annotation>... interestedIn);

    void registerClassTransformer(ClassTransformer transformer);

    OutputProvider outputs();
}