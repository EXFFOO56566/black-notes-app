.class public final Lcom/google/android/gms/internal/ads/pu;
.super Lcom/google/android/gms/internal/ads/yu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ju;


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field protected d:Lcom/google/android/gms/internal/ads/ws;

.field private final e:Lcom/google/android/gms/internal/ads/q7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/q7<",
            "Lcom/google/android/gms/internal/ads/ws;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/lang/Object;

.field private g:Lcom/google/android/gms/internal/ads/jm2;

.field private h:Lcom/google/android/gms/ads/internal/overlay/o;

.field private i:Lcom/google/android/gms/internal/ads/iu;

.field private j:Lcom/google/android/gms/internal/ads/ku;

.field private k:Lcom/google/android/gms/internal/ads/l4;

.field private l:Lcom/google/android/gms/internal/ads/n4;

.field private m:Z

.field private volatile n:Z

.field private o:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private p:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private q:Lcom/google/android/gms/ads/internal/overlay/t;

.field private r:Lcom/google/android/gms/internal/ads/sd;

.field private s:Lcom/google/android/gms/ads/internal/c;

.field private t:Lcom/google/android/gms/internal/ads/ld;

.field private u:Lcom/google/android/gms/internal/ads/vi;

.field private v:Z

.field private w:Z

.field private x:I

.field private y:Z

.field private z:Landroid/view/View$OnAttachStateChangeListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/yu;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->f:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/pu;->m:Z

    new-instance v0, Lcom/google/android/gms/internal/ads/q7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/q7;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->e:Lcom/google/android/gms/internal/ads/q7;

    return-void
.end method

.method private final a(Landroid/view/View;Lcom/google/android/gms/internal/ads/vi;I)V
    .locals 2

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/vi;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    if-lez p3, :cond_0

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/vi;->a(Landroid/view/View;)V

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/vi;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/gl;->h:Lcom/google/android/gms/internal/ads/sk1;

    new-instance v1, Lcom/google/android/gms/internal/ads/ru;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/ru;-><init>(Lcom/google/android/gms/internal/ads/pu;Landroid/view/View;Lcom/google/android/gms/internal/ads/vi;I)V

    const-wide/16 p1, 0x64

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private final a(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->t:Lcom/google/android/gms/internal/ads/ld;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ld;->a()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->b()Lcom/google/android/gms/ads/internal/overlay/n;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->getContext()Landroid/content/Context;

    move-result-object v1

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v1, p1, v0}, Lcom/google/android/gms/ads/internal/overlay/n;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->u:Lcom/google/android/gms/internal/ads/vi;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->m:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->b:Lcom/google/android/gms/ads/internal/overlay/d;

    if-eqz p1, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/overlay/d;->c:Ljava/lang/String;

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/pu;->u:Lcom/google/android/gms/internal/ads/vi;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/vi;->a(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/pu;Landroid/view/View;Lcom/google/android/gms/internal/ads/vi;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/pu;->a(Landroid/view/View;Lcom/google/android/gms/internal/ads/vi;I)V

    return-void
.end method

.method private final e(Lcom/google/android/gms/internal/ads/bv;)Landroid/webkit/WebResourceResponse;
    .locals 7

    new-instance v0, Ljava/net/URL;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/bv;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v2, v2, 0x1

    const/16 v3, 0x14

    if-gt v2, v3, :cond_9

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    const/16 v4, 0x2710

    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    iget-object v4, p1, Lcom/google/android/gms/internal/ads/bv;->c:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v6, v5}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    instance-of v4, v3, Ljava/net/HttpURLConnection;

    if-eqz v4, :cond_8

    check-cast v3, Ljava/net/HttpURLConnection;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/ws;->getContext()Landroid/content/Context;

    move-result-object v5

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/ws;->b()Lcom/google/android/gms/internal/ads/fo;

    move-result-object v6

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    invoke-virtual {v4, v5, v6, v1, v3}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V

    new-instance v4, Lcom/google/android/gms/internal/ads/wn;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/wn;-><init>()V

    const/4 v5, 0x0

    invoke-virtual {v4, v3, v5}, Lcom/google/android/gms/internal/ads/wn;->a(Ljava/net/HttpURLConnection;[B)V

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v6

    invoke-virtual {v4, v3, v6}, Lcom/google/android/gms/internal/ads/wn;->a(Ljava/net/HttpURLConnection;I)V

    const/16 v4, 0x12c

    if-lt v6, v4, :cond_7

    const/16 v4, 0x190

    if-ge v6, v4, :cond_7

    const-string v4, "Location"

    invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    const-string v6, "tel:"

    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    return-object v5

    :cond_1
    new-instance v5, Ljava/net/URL;

    invoke-direct {v5, v0, v4}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string p1, "Protocol is null"

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/pu;->p()Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v6, "http"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    const-string v6, "https"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    const-string p1, "Unsupported scheme: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, v0

    :goto_2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/pu;->p()Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_4
    const-string v0, "Redirecting to "

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_5
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v4

    :goto_3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    move-object v0, v5

    goto/16 :goto_0

    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Missing Location header in redirect"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/gl;->a(Ljava/net/HttpURLConnection;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid protocol."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/io/IOException;

    const/16 v0, 0x20

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Too many redirects (20)"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final n()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->z:Landroid/view/View$OnAttachStateChangeListener;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->z:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method

.method private final o()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->i:Lcom/google/android/gms/internal/ads/iu;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/pu;->v:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/pu;->x:I

    if-lez v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/pu;->w:Z

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->i:Lcom/google/android/gms/internal/ads/iu;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/pu;->w:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/iu;->a(Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->i:Lcom/google/android/gms/internal/ads/iu;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->n()V

    return-void
.end method

.method private static p()Landroid/webkit/WebResourceResponse;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->g0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/webkit/WebResourceResponse;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    const/4 v2, 0x0

    new-array v2, v2, [B

    invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const-string v2, ""

    invoke-direct {v0, v2, v2, v1}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->u:Lcom/google/android/gms/internal/ads/vi;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    invoke-static {v1}, La/g/l/u;->B(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xa

    invoke-direct {p0, v1, v0, v2}, Lcom/google/android/gms/internal/ads/pu;->a(Landroid/view/View;Lcom/google/android/gms/internal/ads/vi;I)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pu;->n()V

    new-instance v1, Lcom/google/android/gms/internal/ads/qu;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/qu;-><init>(Lcom/google/android/gms/internal/ads/pu;Lcom/google/android/gms/internal/ads/vi;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->z:Landroid/view/View$OnAttachStateChangeListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->z:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_1
    return-void
.end method

.method public final a(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->t:Lcom/google/android/gms/internal/ads/ld;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ld;->a(II)V

    :cond_0
    return-void
.end method

.method public final a(IIZ)V
    .locals 1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/pu;->r:Lcom/google/android/gms/internal/ads/sd;

    invoke-virtual {p3, p1, p2}, Lcom/google/android/gms/internal/ads/sd;->a(II)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/pu;->t:Lcom/google/android/gms/internal/ads/ld;

    if-eqz p3, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p3, p1, p2, v0}, Lcom/google/android/gms/internal/ads/ld;->a(IIZ)V

    :cond_0
    return-void
.end method

.method public final a(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->e:Lcom/google/android/gms/internal/ads/q7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/q7;->b(Landroid/net/Uri;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/internal/overlay/d;)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->h()Z

    move-result v0

    new-instance v7, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/lu;->b()Z

    move-result v2

    if-nez v2, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/pu;->g:Lcom/google/android/gms/internal/ads/jm2;

    move-object v3, v2

    :goto_0
    if-eqz v0, :cond_1

    move-object v4, v1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->h:Lcom/google/android/gms/ads/internal/overlay/o;

    move-object v4, v0

    :goto_1
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/pu;->q:Lcom/google/android/gms/ads/internal/overlay/t;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->b()Lcom/google/android/gms/internal/ads/fo;

    move-result-object v6

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/overlay/d;Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/ads/internal/overlay/t;Lcom/google/android/gms/internal/ads/fo;)V

    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/ads/pu;->a(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/bv;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/pu;->v:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/pu;->j:Lcom/google/android/gms/internal/ads/ku;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ku;->a()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pu;->j:Lcom/google/android/gms/internal/ads/ku;

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pu;->o()V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/iu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pu;->i:Lcom/google/android/gms/internal/ads/iu;

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/internal/ads/l4;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/internal/ads/n4;Lcom/google/android/gms/ads/internal/overlay/t;ZLcom/google/android/gms/internal/ads/g5;Lcom/google/android/gms/ads/internal/c;Lcom/google/android/gms/internal/ads/vd;Lcom/google/android/gms/internal/ads/vi;)V
    .locals 1

    if-nez p8, :cond_0

    new-instance p8, Lcom/google/android/gms/ads/internal/c;

    iget-object p7, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {p7}, Lcom/google/android/gms/internal/ads/ws;->getContext()Landroid/content/Context;

    move-result-object p7

    const/4 v0, 0x0

    invoke-direct {p8, p7, p10, v0}, Lcom/google/android/gms/ads/internal/c;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/vi;Lcom/google/android/gms/internal/ads/nf;)V

    :cond_0
    new-instance p7, Lcom/google/android/gms/internal/ads/ld;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-direct {p7, v0, p9}, Lcom/google/android/gms/internal/ads/ld;-><init>(Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/vd;)V

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/pu;->t:Lcom/google/android/gms/internal/ads/ld;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/pu;->u:Lcom/google/android/gms/internal/ads/vi;

    sget-object p7, Lcom/google/android/gms/internal/ads/zr2;->m0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object p10

    invoke-virtual {p10, p7}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Ljava/lang/Boolean;

    invoke-virtual {p7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p7

    if-eqz p7, :cond_1

    new-instance p7, Lcom/google/android/gms/internal/ads/j4;

    invoke-direct {p7, p2}, Lcom/google/android/gms/internal/ads/j4;-><init>(Lcom/google/android/gms/internal/ads/l4;)V

    const-string p10, "/adMetadata"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    :cond_1
    new-instance p7, Lcom/google/android/gms/internal/ads/k4;

    invoke-direct {p7, p4}, Lcom/google/android/gms/internal/ads/k4;-><init>(Lcom/google/android/gms/internal/ads/n4;)V

    const-string p10, "/appEvent"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->j:Lcom/google/android/gms/internal/ads/d5;

    const-string p10, "/backButton"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->k:Lcom/google/android/gms/internal/ads/d5;

    const-string p10, "/refresh"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->a:Lcom/google/android/gms/internal/ads/d5;

    const-string p10, "/canOpenURLs"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->b:Lcom/google/android/gms/internal/ads/d5;

    const-string p10, "/canOpenIntents"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->c:Lcom/google/android/gms/internal/ads/d5;

    const-string p10, "/click"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->d:Lcom/google/android/gms/internal/ads/d5;

    const-string p10, "/close"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->e:Lcom/google/android/gms/internal/ads/d5;

    const-string p10, "/customClose"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->n:Lcom/google/android/gms/internal/ads/d5;

    const-string p10, "/instrument"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->p:Lcom/google/android/gms/internal/ads/d5;

    const-string p10, "/delayPageLoaded"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->q:Lcom/google/android/gms/internal/ads/d5;

    const-string p10, "/delayPageClosed"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->r:Lcom/google/android/gms/internal/ads/d5;

    const-string p10, "/getLocationInfo"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->f:Lcom/google/android/gms/internal/ads/d5;

    const-string p10, "/httpTrack"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->g:Lcom/google/android/gms/internal/ads/d5;

    const-string p10, "/log"

    invoke-virtual {p0, p10, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    new-instance p7, Lcom/google/android/gms/internal/ads/i5;

    iget-object p10, p0, Lcom/google/android/gms/internal/ads/pu;->t:Lcom/google/android/gms/internal/ads/ld;

    invoke-direct {p7, p8, p10, p9}, Lcom/google/android/gms/internal/ads/i5;-><init>(Lcom/google/android/gms/ads/internal/c;Lcom/google/android/gms/internal/ads/ld;Lcom/google/android/gms/internal/ads/vd;)V

    const-string p9, "/mraid"

    invoke-virtual {p0, p9, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    iget-object p7, p0, Lcom/google/android/gms/internal/ads/pu;->r:Lcom/google/android/gms/internal/ads/sd;

    const-string p9, "/mraidLoaded"

    invoke-virtual {p0, p9, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    new-instance p7, Lcom/google/android/gms/internal/ads/h5;

    iget-object p9, p0, Lcom/google/android/gms/internal/ads/pu;->t:Lcom/google/android/gms/internal/ads/ld;

    invoke-direct {p7, p8, p9}, Lcom/google/android/gms/internal/ads/h5;-><init>(Lcom/google/android/gms/ads/internal/c;Lcom/google/android/gms/internal/ads/ld;)V

    const-string p9, "/open"

    invoke-virtual {p0, p9, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    new-instance p7, Lcom/google/android/gms/internal/ads/fs;

    invoke-direct {p7}, Lcom/google/android/gms/internal/ads/fs;-><init>()V

    const-string p9, "/precache"

    invoke-virtual {p0, p9, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->i:Lcom/google/android/gms/internal/ads/d5;

    const-string p9, "/touch"

    invoke-virtual {p0, p9, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->l:Lcom/google/android/gms/internal/ads/d5;

    const-string p9, "/video"

    invoke-virtual {p0, p9, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object p7, Lcom/google/android/gms/internal/ads/p4;->m:Lcom/google/android/gms/internal/ads/d5;

    const-string p9, "/videoMeta"

    invoke-virtual {p0, p9, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->A()Lcom/google/android/gms/internal/ads/cj;

    move-result-object p7

    iget-object p9, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {p9}, Lcom/google/android/gms/internal/ads/ws;->getContext()Landroid/content/Context;

    move-result-object p9

    invoke-virtual {p7, p9}, Lcom/google/android/gms/internal/ads/cj;->a(Landroid/content/Context;)Z

    move-result p7

    if-eqz p7, :cond_2

    new-instance p7, Lcom/google/android/gms/internal/ads/f5;

    iget-object p9, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {p9}, Lcom/google/android/gms/internal/ads/ws;->getContext()Landroid/content/Context;

    move-result-object p9

    invoke-direct {p7, p9}, Lcom/google/android/gms/internal/ads/f5;-><init>(Landroid/content/Context;)V

    const-string p9, "/logScionEvent"

    invoke-virtual {p0, p9, p7}, Lcom/google/android/gms/internal/ads/pu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    :cond_2
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pu;->g:Lcom/google/android/gms/internal/ads/jm2;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/pu;->h:Lcom/google/android/gms/ads/internal/overlay/o;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/pu;->k:Lcom/google/android/gms/internal/ads/l4;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/pu;->l:Lcom/google/android/gms/internal/ads/n4;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/pu;->q:Lcom/google/android/gms/ads/internal/overlay/t;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/pu;->s:Lcom/google/android/gms/ads/internal/c;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ads/pu;->m:Z

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ku;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pu;->j:Lcom/google/android/gms/internal/ads/ku;

    return-void
.end method

.method final a(Lcom/google/android/gms/internal/ads/ws;Z)V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/sd;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->D()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/gr2;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/gr2;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/sd;-><init>(Lcom/google/android/gms/internal/ads/ws;Landroid/content/Context;Lcom/google/android/gms/internal/ads/gr2;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/pu;->n:Z

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->r:Lcom/google/android/gms/internal/ads/sd;

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/pu;->t:Lcom/google/android/gms/internal/ads/ld;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/pu;->e:Lcom/google/android/gms/internal/ads/q7;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/q7;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/common/util/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/common/util/m<",
            "Lcom/google/android/gms/internal/ads/d5<",
            "-",
            "Lcom/google/android/gms/internal/ads/ws;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->e:Lcom/google/android/gms/internal/ads/q7;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/q7;->a(Ljava/lang/String;Lcom/google/android/gms/common/util/m;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/d5<",
            "-",
            "Lcom/google/android/gms/internal/ads/ws;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->e:Lcom/google/android/gms/internal/ads/q7;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/q7;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    return-void
.end method

.method public final a(Z)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/pu;->f:Ljava/lang/Object;

    monitor-enter p1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/pu;->o:Z

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(ZI)V
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->h()Z

    move-result v0

    new-instance v9, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->g:Lcom/google/android/gms/internal/ads/jm2;

    :goto_0
    move-object v2, v0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/pu;->h:Lcom/google/android/gms/ads/internal/overlay/o;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/pu;->q:Lcom/google/android/gms/ads/internal/overlay/t;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/ws;->b()Lcom/google/android/gms/internal/ads/fo;

    move-result-object v8

    move-object v1, v9

    move v6, p1

    move v7, p2

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/ads/internal/overlay/t;Lcom/google/android/gms/internal/ads/ws;ZILcom/google/android/gms/internal/ads/fo;)V

    invoke-direct {p0, v9}, Lcom/google/android/gms/internal/ads/pu;->a(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method

.method public final a(ZILjava/lang/String;)V
    .locals 14

    move-object v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->h()Z

    move-result v1

    new-instance v13, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/lu;->b()Z

    move-result v3

    if-nez v3, :cond_0

    move-object v3, v2

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/pu;->g:Lcom/google/android/gms/internal/ads/jm2;

    :goto_0
    if-eqz v1, :cond_1

    move-object v4, v2

    goto :goto_1

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/ads/tu;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/pu;->h:Lcom/google/android/gms/ads/internal/overlay/o;

    invoke-direct {v1, v2, v4}, Lcom/google/android/gms/internal/ads/tu;-><init>(Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/ads/internal/overlay/o;)V

    move-object v4, v1

    :goto_1
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/pu;->k:Lcom/google/android/gms/internal/ads/l4;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/pu;->l:Lcom/google/android/gms/internal/ads/n4;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/pu;->q:Lcom/google/android/gms/ads/internal/overlay/t;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/ws;->b()Lcom/google/android/gms/internal/ads/fo;

    move-result-object v12

    move-object v2, v13

    move v9, p1

    move/from16 v10, p2

    move-object/from16 v11, p3

    invoke-direct/range {v2 .. v12}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/internal/ads/l4;Lcom/google/android/gms/internal/ads/n4;Lcom/google/android/gms/ads/internal/overlay/t;Lcom/google/android/gms/internal/ads/ws;ZILjava/lang/String;Lcom/google/android/gms/internal/ads/fo;)V

    invoke-direct {p0, v13}, Lcom/google/android/gms/internal/ads/pu;->a(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method

.method public final a(ZILjava/lang/String;Ljava/lang/String;)V
    .locals 15

    move-object v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->h()Z

    move-result v1

    new-instance v14, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/lu;->b()Z

    move-result v3

    if-nez v3, :cond_0

    move-object v3, v2

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/pu;->g:Lcom/google/android/gms/internal/ads/jm2;

    :goto_0
    if-eqz v1, :cond_1

    move-object v4, v2

    goto :goto_1

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/ads/tu;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/pu;->h:Lcom/google/android/gms/ads/internal/overlay/o;

    invoke-direct {v1, v2, v4}, Lcom/google/android/gms/internal/ads/tu;-><init>(Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/ads/internal/overlay/o;)V

    move-object v4, v1

    :goto_1
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/pu;->k:Lcom/google/android/gms/internal/ads/l4;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/pu;->l:Lcom/google/android/gms/internal/ads/n4;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/pu;->q:Lcom/google/android/gms/ads/internal/overlay/t;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/ws;->b()Lcom/google/android/gms/internal/ads/fo;

    move-result-object v13

    move-object v2, v14

    move/from16 v9, p1

    move/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    invoke-direct/range {v2 .. v13}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/internal/ads/l4;Lcom/google/android/gms/internal/ads/n4;Lcom/google/android/gms/ads/internal/overlay/t;Lcom/google/android/gms/internal/ads/ws;ZILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/fo;)V

    invoke-direct {p0, v14}, Lcom/google/android/gms/internal/ads/pu;->a(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method

.method public final b()Lcom/google/android/gms/ads/internal/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->s:Lcom/google/android/gms/ads/internal/c;

    return-object v0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/bv;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->e:Lcom/google/android/gms/internal/ads/q7;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/bv;->b:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/q7;->a(Landroid/net/Uri;)Z

    return-void
.end method

.method public final b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/d5<",
            "-",
            "Lcom/google/android/gms/internal/ads/ws;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->e:Lcom/google/android/gms/internal/ads/q7;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/q7;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    return-void
.end method

.method public final b(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/pu;->p:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/pu;->x:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/pu;->x:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pu;->o()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final c(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/pu;->m:Z

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/ads/bv;)Z
    .locals 11

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/bv;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "AdWebView shouldOverrideUrlLoading: "

    if-eqz v1, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/bv;->b:Landroid/net/Uri;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->e:Lcom/google/android/gms/internal/ads/q7;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/q7;->a(Landroid/net/Uri;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/pu;->m:Z

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v3, "http"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_3

    const-string v3, "https"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v1, 0x1

    :goto_2
    if-eqz v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->g:Lcom/google/android/gms/internal/ads/jm2;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/jm2;->l()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->u:Lcom/google/android/gms/internal/ads/vi;

    if-eqz v0, :cond_4

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/bv;->a:Ljava/lang/String;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/vi;->a(Ljava/lang/String;)V

    :cond_4
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pu;->g:Lcom/google/android/gms/internal/ads/jm2;

    :cond_5
    return v4

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebView;->willNotDraw()Z

    move-result v1

    if-nez v1, :cond_b

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->d()Lcom/google/android/gms/internal/ads/eq1;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/eq1;->a(Landroid/net/Uri;)Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/ws;->getView()Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/ws;->a()Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v1, v0, v3, v4, v5}, Lcom/google/android/gms/internal/ads/eq1;->a(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/ht1; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    nop

    const-string v1, "Unable to append parameter to URL: "

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/bv;->a:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_7
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v1, v3

    :goto_3
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    :cond_8
    :goto_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->s:Lcom/google/android/gms/ads/internal/c;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/c;->b()Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_5

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->s:Lcom/google/android/gms/ads/internal/c;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/bv;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/c;->a(Ljava/lang/String;)V

    goto :goto_7

    :cond_a
    :goto_5
    new-instance p1, Lcom/google/android/gms/ads/internal/overlay/d;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v4, "android.intent.action.VIEW"

    move-object v3, p1

    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/ads/internal/overlay/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/pu;->a(Lcom/google/android/gms/ads/internal/overlay/d;)V

    goto :goto_7

    :cond_b
    const-string v0, "AdWebView unable to handle URL: "

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/bv;->a:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_6

    :cond_c
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_6
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    :goto_7
    return v2
.end method

.method public final d(Lcom/google/android/gms/internal/ads/bv;)Landroid/webkit/WebResourceResponse;
    .locals 5

    const-string v0, ""

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->u:Lcom/google/android/gms/internal/ads/vi;

    if-eqz v1, :cond_0

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/bv;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/bv;->c:Ljava/util/Map;

    const/4 v4, 0x1

    invoke-interface {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/vi;->a(Ljava/lang/String;Ljava/util/Map;I)V

    :cond_0
    new-instance v1, Ljava/io/File;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/bv;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mraid.js"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move-object v1, v2

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/pu;->d()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->f()Lcom/google/android/gms/internal/ads/lu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lu;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lcom/google/android/gms/internal/ads/zr2;->E:Lcom/google/android/gms/internal/ads/kr2;

    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ws;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lcom/google/android/gms/internal/ads/zr2;->D:Lcom/google/android/gms/internal/ads/kr2;

    goto :goto_0

    :cond_3
    sget-object v1, Lcom/google/android/gms/internal/ads/zr2;->C:Lcom/google/android/gms/internal/ads/kr2;

    goto :goto_0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/ws;->b()Lcom/google/android/gms/internal/ads/fo;

    move-result-object v4

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    invoke-static {v3, v4, v1}, Lcom/google/android/gms/internal/ads/gl;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v1

    :goto_2
    if-eqz v1, :cond_4

    return-object v1

    :cond_4
    :try_start_0
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/bv;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ws;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/pu;->y:Z

    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/ads/sj;->a(Ljava/lang/String;Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/bv;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/pu;->e(Lcom/google/android/gms/internal/ads/bv;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_5
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/bv;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ij2;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ij2;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->i()Lcom/google/android/gms/internal/ads/zi2;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zi2;->a(Lcom/google/android/gms/internal/ads/ij2;)Lcom/google/android/gms/internal/ads/hj2;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/hj2;->d()Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance p1, Landroid/webkit/WebResourceResponse;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/hj2;->e()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {p1, v0, v0, v1}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    return-object p1

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/wn;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lcom/google/android/gms/internal/ads/l0;->b:Lcom/google/android/gms/internal/ads/b0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/b0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/pu;->e(Lcom/google/android/gms/internal/ads/bv;)Landroid/webkit/WebResourceResponse;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_7
    return-object v2

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    :goto_3
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->g()Lcom/google/android/gms/internal/ads/ik;

    move-result-object v0

    const-string v1, "AdWebViewClient.interceptRequest"

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/ik;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/pu;->p()Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->f:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/pu;->m:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/pu;->n:Z

    sget-object v1, Lcom/google/android/gms/internal/ads/jo;->e:Lcom/google/android/gms/internal/ads/ko1;

    new-instance v2, Lcom/google/android/gms/internal/ads/ou;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/ou;-><init>(Lcom/google/android/gms/internal/ads/pu;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final d(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/pu;->y:Z

    return-void
.end method

.method public final e()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/pu;->w:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pu;->o()V

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/pu;->n:Z

    return v0
.end method

.method public final g()Lcom/google/android/gms/internal/ads/vi;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->u:Lcom/google/android/gms/internal/ads/vi;

    return-object v0
.end method

.method public final h()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/pu;->x:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/pu;->x:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pu;->o()V

    return-void
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->u:Lcom/google/android/gms/internal/ads/vi;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/vi;->b()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->u:Lcom/google/android/gms/internal/ads/vi;

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pu;->n()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->e:Lcom/google/android/gms/internal/ads/q7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/q7;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->e:Lcom/google/android/gms/internal/ads/q7;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/q7;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->g:Lcom/google/android/gms/internal/ads/jm2;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->h:Lcom/google/android/gms/ads/internal/overlay/o;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->i:Lcom/google/android/gms/internal/ads/iu;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->j:Lcom/google/android/gms/internal/ads/ku;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->k:Lcom/google/android/gms/internal/ads/l4;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->l:Lcom/google/android/gms/internal/ads/n4;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->q:Lcom/google/android/gms/ads/internal/overlay/t;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/pu;->t:Lcom/google/android/gms/internal/ads/ld;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/pu;->t:Lcom/google/android/gms/internal/ads/ld;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/ld;->a(Z)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/pu;->t:Lcom/google/android/gms/internal/ads/ld;

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/pu;->o:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final k()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/pu;->p:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final l()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->f:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final m()Landroid/view/ViewTreeObserver$OnScrollChangedListener;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->f:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->H()Lcom/google/android/gms/internal/ads/yi2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/yi2;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    if-ne p1, v1, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/yi2;->a(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/pu;->d:Lcom/google/android/gms/internal/ads/ws;

    invoke-virtual {p2}, Landroid/webkit/RenderProcessGoneDetail;->didCrash()Z

    move-result v0

    invoke-virtual {p2}, Landroid/webkit/RenderProcessGoneDetail;->rendererPriorityAtExit()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/ws;->b(ZI)Z

    move-result p1

    return p1
.end method
