.class public final Lcom/google/android/gms/internal/ads/er;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/q72;
.implements Lcom/google/android/gms/internal/ads/id2;
.implements Lcom/google/android/gms/internal/ads/nf2;
.implements Lcom/google/android/gms/internal/ads/sg2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/q72;",
        "Lcom/google/android/gms/internal/ads/id2;",
        "Lcom/google/android/gms/internal/ads/nf2<",
        "Lcom/google/android/gms/internal/ads/ye2;",
        ">;",
        "Lcom/google/android/gms/internal/ads/sg2;"
    }
.end annotation


# static fields
.field private static n:I

.field private static o:I


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/br;

.field private final d:Lcom/google/android/gms/internal/ads/j82;

.field private final e:Lcom/google/android/gms/internal/ads/j82;

.field private final f:Lcom/google/android/gms/internal/ads/me2;

.field private final g:Lcom/google/android/gms/internal/ads/hq;

.field private h:Lcom/google/android/gms/internal/ads/r72;

.field private i:Ljava/nio/ByteBuffer;

.field private j:Z

.field private k:Lcom/google/android/gms/internal/ads/nr;

.field private l:I

.field private m:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/android/gms/internal/ads/xq;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/hq;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/er;->m:Ljava/util/Set;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/er;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/er;->g:Lcom/google/android/gms/internal/ads/hq;

    new-instance p1, Lcom/google/android/gms/internal/ads/br;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/br;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/er;->c:Lcom/google/android/gms/internal/ads/br;

    new-instance p1, Lcom/google/android/gms/internal/ads/mg2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/er;->b:Landroid/content/Context;

    sget-object v2, Lcom/google/android/gms/internal/ads/gc2;->a:Lcom/google/android/gms/internal/ads/gc2;

    sget-object v5, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    const-wide/16 v3, 0x0

    const/4 v7, -0x1

    move-object v0, p1

    move-object v6, p0

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/mg2;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/gc2;JLcom/google/android/gms/internal/ads/sk1;Lcom/google/android/gms/internal/ads/sg2;I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/er;->d:Lcom/google/android/gms/internal/ads/j82;

    new-instance p1, Lcom/google/android/gms/internal/ads/o92;

    sget-object p2, Lcom/google/android/gms/internal/ads/gc2;->a:Lcom/google/android/gms/internal/ads/gc2;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/o92;-><init>(Lcom/google/android/gms/internal/ads/gc2;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/er;->e:Lcom/google/android/gms/internal/ads/j82;

    new-instance p1, Lcom/google/android/gms/internal/ads/he2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/he2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/er;->f:Lcom/google/android/gms/internal/ads/me2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/wk;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, 0x1c

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "ExoPlayerAdapter initialize "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    :cond_0
    sget p1, Lcom/google/android/gms/internal/ads/er;->n:I

    const/4 p2, 0x1

    add-int/2addr p1, p2

    sput p1, Lcom/google/android/gms/internal/ads/er;->n:I

    const/4 p1, 0x2

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/j82;

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/er;->e:Lcom/google/android/gms/internal/ads/j82;

    aput-object v1, p1, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->d:Lcom/google/android/gms/internal/ads/j82;

    aput-object v0, p1, p2

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/er;->f:Lcom/google/android/gms/internal/ads/me2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->c:Lcom/google/android/gms/internal/ads/br;

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/v72;->a([Lcom/google/android/gms/internal/ads/j82;Lcom/google/android/gms/internal/ads/se2;Lcom/google/android/gms/internal/ads/i82;)Lcom/google/android/gms/internal/ads/r72;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/r72;->b(Lcom/google/android/gms/internal/ads/q72;)V

    return-void
.end method

.method private final a(Landroid/net/Uri;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/nd2;
    .locals 10

    new-instance v9, Lcom/google/android/gms/internal/ads/jd2;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/er;->j:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    if-lez v0, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/er;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result p2

    new-array p2, p2, [B

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance v0, Lcom/google/android/gms/internal/ads/dr;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/dr;-><init>([B)V

    :cond_0
    :goto_0
    move-object v2, v0

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->g:Lcom/google/android/gms/internal/ads/hq;

    iget v0, v0, Lcom/google/android/gms/internal/ads/hq;->h:I

    if-lez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/ads/gr;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/gr;-><init>(Lcom/google/android/gms/internal/ads/er;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/ads/fr;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/fr;-><init>(Lcom/google/android/gms/internal/ads/er;Ljava/lang/String;)V

    :goto_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/er;->g:Lcom/google/android/gms/internal/ads/hq;

    iget-boolean p2, p2, Lcom/google/android/gms/internal/ads/hq;->i:Z

    if-eqz p2, :cond_3

    new-instance p2, Lcom/google/android/gms/internal/ads/ir;

    invoke-direct {p2, p0, v0}, Lcom/google/android/gms/internal/ads/ir;-><init>(Lcom/google/android/gms/internal/ads/er;Lcom/google/android/gms/internal/ads/xe2;)V

    move-object v0, p2

    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/er;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result p2

    if-lez p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/er;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result p2

    new-array p2, p2, [B

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/er;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance v1, Lcom/google/android/gms/internal/ads/hr;

    invoke-direct {v1, v0, p2}, Lcom/google/android/gms/internal/ads/hr;-><init>(Lcom/google/android/gms/internal/ads/xe2;[B)V

    move-object v0, v1

    goto :goto_0

    :goto_2
    sget-object v3, Lcom/google/android/gms/internal/ads/lr;->a:Lcom/google/android/gms/internal/ads/oa2;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/er;->g:Lcom/google/android/gms/internal/ads/hq;

    iget v4, p2, Lcom/google/android/gms/internal/ads/hq;->j:I

    sget-object v5, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    const/4 v7, 0x0

    iget v8, p2, Lcom/google/android/gms/internal/ads/hq;->f:I

    move-object v0, v9

    move-object v1, p1

    move-object v6, p0

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/jd2;-><init>(Landroid/net/Uri;Lcom/google/android/gms/internal/ads/xe2;Lcom/google/android/gms/internal/ads/oa2;ILcom/google/android/gms/internal/ads/sk1;Lcom/google/android/gms/internal/ads/id2;Ljava/lang/String;I)V

    return-object v9
.end method

.method public static f()I
    .locals 1

    sget v0, Lcom/google/android/gms/internal/ads/er;->n:I

    return v0
.end method

.method public static g()I
    .locals 1

    sget v0, Lcom/google/android/gms/internal/ads/er;->o:I

    return v0
.end method


# virtual methods
.method final synthetic a(Lcom/google/android/gms/internal/ads/xe2;)Lcom/google/android/gms/internal/ads/ye2;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/zq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/er;->b:Landroid/content/Context;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/xe2;->a()Lcom/google/android/gms/internal/ads/ye2;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/ads/jr;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/jr;-><init>(Lcom/google/android/gms/internal/ads/er;)V

    invoke-direct {v0, v1, p1, p0, v2}, Lcom/google/android/gms/internal/ads/zq;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ye2;Lcom/google/android/gms/internal/ads/nf2;Lcom/google/android/gms/internal/ads/cr;)V

    return-object v0
.end method

.method final synthetic a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ye2;
    .locals 9

    new-instance v8, Lcom/google/android/gms/internal/ads/bf2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->g:Lcom/google/android/gms/internal/ads/hq;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/hq;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, p0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->g:Lcom/google/android/gms/internal/ads/hq;

    iget v4, v0, Lcom/google/android/gms/internal/ads/hq;->d:I

    iget v5, v0, Lcom/google/android/gms/internal/ads/hq;->e:I

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v2, 0x0

    move-object v0, v8

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/bf2;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zf2;Lcom/google/android/gms/internal/ads/nf2;IIZLcom/google/android/gms/internal/ads/hf2;)V

    return-object v8
.end method

.method public final a()V
    .locals 0

    return-void
.end method

.method final a(FZ)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/s72;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/er;->e:Lcom/google/android/gms/internal/ads/j82;

    const/4 v2, 0x2

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/s72;-><init>(Lcom/google/android/gms/internal/ads/t72;ILjava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    new-array v1, v1, [Lcom/google/android/gms/internal/ads/s72;

    aput-object v0, v1, p1

    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/r72;->a([Lcom/google/android/gms/internal/ads/s72;)V

    return-void

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    new-array v1, v1, [Lcom/google/android/gms/internal/ads/s72;

    aput-object v0, v1, p1

    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/r72;->b([Lcom/google/android/gms/internal/ads/s72;)V

    return-void
.end method

.method public final a(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->m:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/xq;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/xq;->a(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final a(IIIF)V
    .locals 0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/er;->k:Lcom/google/android/gms/internal/ads/nr;

    if-eqz p3, :cond_0

    invoke-interface {p3, p1, p2}, Lcom/google/android/gms/internal/ads/nr;->a(II)V

    :cond_0
    return-void
.end method

.method public final a(IJ)V
    .locals 0

    return-void
.end method

.method public final a(Landroid/view/Surface;)V
    .locals 0

    return-void
.end method

.method final a(Landroid/view/Surface;Z)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/s72;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/er;->d:Lcom/google/android/gms/internal/ads/j82;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/s72;-><init>(Lcom/google/android/gms/internal/ads/t72;ILjava/lang/Object;)V

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    new-array v1, v2, [Lcom/google/android/gms/internal/ads/s72;

    aput-object v0, v1, p1

    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/r72;->a([Lcom/google/android/gms/internal/ads/s72;)V

    return-void

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    new-array v1, v2, [Lcom/google/android/gms/internal/ads/s72;

    aput-object v0, v1, p1

    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/r72;->b([Lcom/google/android/gms/internal/ads/s72;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/e82;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ee2;Lcom/google/android/gms/internal/ads/pe2;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/k82;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/nr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/er;->k:Lcom/google/android/gms/internal/ads/nr;

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/o72;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->k:Lcom/google/android/gms/internal/ads/nr;

    if-eqz v0, :cond_0

    const-string v1, "onPlayerError"

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/nr;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/o82;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/y92;)V
    .locals 0

    return-void
.end method

.method public final a(Ljava/io/IOException;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->k:Lcom/google/android/gms/internal/ads/nr;

    if-eqz v0, :cond_0

    const-string v1, "onLoadError"

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/nr;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;I)V
    .locals 0

    iget p1, p0, Lcom/google/android/gms/internal/ads/er;->l:I

    add-int/2addr p1, p2

    iput p1, p0, Lcom/google/android/gms/internal/ads/er;->l:I

    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/ze2;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/er;->l:I

    return-void
.end method

.method public final a(Ljava/lang/String;JJ)V
    .locals 0

    return-void
.end method

.method public final a(Z)V
    .locals 0

    return-void
.end method

.method public final a(ZI)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/er;->k:Lcom/google/android/gms/internal/ads/nr;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/nr;->a(I)V

    :cond_0
    return-void
.end method

.method final synthetic a(ZJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->k:Lcom/google/android/gms/internal/ads/nr;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/nr;->a(ZJ)V

    :cond_0
    return-void
.end method

.method public final a([Landroid/net/Uri;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/google/android/gms/internal/ads/er;->a([Landroid/net/Uri;Ljava/lang/String;Ljava/nio/ByteBuffer;Z)V

    return-void
.end method

.method public final a([Landroid/net/Uri;Ljava/lang/String;Ljava/nio/ByteBuffer;Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/er;->i:Ljava/nio/ByteBuffer;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/er;->j:Z

    array-length p3, p1

    const/4 p4, 0x0

    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    aget-object p1, p1, p4

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/er;->a(Landroid/net/Uri;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/nd2;

    move-result-object p1

    goto :goto_1

    :cond_1
    array-length p3, p1

    new-array p3, p3, [Lcom/google/android/gms/internal/ads/nd2;

    :goto_0
    array-length v1, p1

    if-ge p4, v1, :cond_2

    aget-object v1, p1, p4

    invoke-direct {p0, v1, p2}, Lcom/google/android/gms/internal/ads/er;->a(Landroid/net/Uri;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/nd2;

    move-result-object v1

    aput-object v1, p3, p4

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/od2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/od2;-><init>([Lcom/google/android/gms/internal/ads/nd2;)V

    :goto_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/r72;->a(Lcom/google/android/gms/internal/ads/nd2;)V

    sget p1, Lcom/google/android/gms/internal/ads/er;->o:I

    add-int/2addr p1, v0

    sput p1, Lcom/google/android/gms/internal/ads/er;->o:I

    return-void
.end method

.method public final b()J
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/er;->l:I

    int-to-long v0, v0

    return-wide v0
.end method

.method final synthetic b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ye2;
    .locals 7

    new-instance v6, Lcom/google/android/gms/internal/ads/xq;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->g:Lcom/google/android/gms/internal/ads/hq;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/hq;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->g:Lcom/google/android/gms/internal/ads/hq;

    iget v3, v0, Lcom/google/android/gms/internal/ads/hq;->d:I

    iget v4, v0, Lcom/google/android/gms/internal/ads/hq;->e:I

    iget v5, v0, Lcom/google/android/gms/internal/ads/hq;->h:I

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/xq;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/nf2;III)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/er;->m:Ljava/util/Set;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v6
.end method

.method public final b(Lcom/google/android/gms/internal/ads/y92;)V
    .locals 0

    return-void
.end method

.method final b(Z)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/r72;->W()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/er;->f:Lcom/google/android/gms/internal/ads/me2;

    xor-int/lit8 v2, p1, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/me2;->a(IZ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/r72;->a(Lcom/google/android/gms/internal/ads/q72;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/r72;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    sget v0, Lcom/google/android/gms/internal/ads/er;->o:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/google/android/gms/internal/ads/er;->o:I

    :cond_0
    return-void
.end method

.method public final d()Lcom/google/android/gms/internal/ads/r72;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->h:Lcom/google/android/gms/internal/ads/r72;

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/internal/ads/br;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/er;->c:Lcom/google/android/gms/internal/ads/br;

    return-object v0
.end method

.method public final finalize()V
    .locals 3

    sget v0, Lcom/google/android/gms/internal/ads/er;->n:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/google/android/gms/internal/ads/er;->n:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/wk;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1a

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "ExoPlayerAdapter finalize "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
