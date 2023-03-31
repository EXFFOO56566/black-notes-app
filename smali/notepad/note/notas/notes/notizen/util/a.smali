.class public Lnotepad/note/notas/notes/notizen/util/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lnotepad/note/notas/notes/notizen/util/a;->a:J

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lnotepad/note/notas/notes/notizen/util/a;->a:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x258

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lnotepad/note/notas/notes/notizen/util/a;->a:J

    const/4 v0, 0x1

    return v0
.end method
