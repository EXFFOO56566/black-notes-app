.class final synthetic Lcom/google/android/gms/internal/ads/gt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/nl1;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/lu;

.field private final c:Ljava/lang/String;

.field private final d:Z

.field private final e:Z

.field private final f:Lcom/google/android/gms/internal/ads/eq1;

.field private final g:Lcom/google/android/gms/internal/ads/fo;

.field private final h:Lcom/google/android/gms/internal/ads/o;

.field private final i:Lcom/google/android/gms/ads/internal/i;

.field private final j:Lcom/google/android/gms/ads/internal/a;

.field private final k:Lcom/google/android/gms/internal/ads/wj2;

.field private final l:Lcom/google/android/gms/internal/ads/yi2;

.field private final m:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/lu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/ads/internal/i;Lcom/google/android/gms/ads/internal/a;Lcom/google/android/gms/internal/ads/wj2;Lcom/google/android/gms/internal/ads/yi2;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gt;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gt;->b:Lcom/google/android/gms/internal/ads/lu;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/gt;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/gt;->d:Z

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/gt;->e:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/gt;->f:Lcom/google/android/gms/internal/ads/eq1;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/gt;->g:Lcom/google/android/gms/internal/ads/fo;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gt;->h:Lcom/google/android/gms/internal/ads/o;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/gt;->i:Lcom/google/android/gms/ads/internal/i;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/gt;->j:Lcom/google/android/gms/ads/internal/a;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/gt;->k:Lcom/google/android/gms/internal/ads/wj2;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/gt;->l:Lcom/google/android/gms/internal/ads/yi2;

    iput-boolean p13, p0, Lcom/google/android/gms/internal/ads/gt;->m:Z

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/gt;->a:Landroid/content/Context;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/gt;->b:Lcom/google/android/gms/internal/ads/lu;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/gt;->c:Ljava/lang/String;

    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/gt;->d:Z

    iget-boolean v14, v0, Lcom/google/android/gms/internal/ads/gt;->e:Z

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/gt;->f:Lcom/google/android/gms/internal/ads/eq1;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/gt;->g:Lcom/google/android/gms/internal/ads/fo;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/gt;->h:Lcom/google/android/gms/internal/ads/o;

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/gt;->i:Lcom/google/android/gms/ads/internal/i;

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/gt;->j:Lcom/google/android/gms/ads/internal/a;

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/gt;->k:Lcom/google/android/gms/internal/ads/wj2;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/gt;->l:Lcom/google/android/gms/internal/ads/yi2;

    iget-boolean v13, v0, Lcom/google/android/gms/internal/ads/gt;->m:Z

    new-instance v11, Lcom/google/android/gms/internal/ads/ht;

    move v5, v14

    move-object v0, v11

    move-object v11, v15

    invoke-static/range {v1 .. v13}, Lcom/google/android/gms/internal/ads/nt;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/lu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/ads/internal/i;Lcom/google/android/gms/ads/internal/a;Lcom/google/android/gms/internal/ads/wj2;Lcom/google/android/gms/internal/ads/yi2;Z)Lcom/google/android/gms/internal/ads/nt;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/ht;-><init>(Lcom/google/android/gms/internal/ads/ws;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    move-result-object v1

    invoke-virtual {v1, v0, v15, v14}, Lcom/google/android/gms/internal/ads/ll;->a(Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/wj2;Z)Lcom/google/android/gms/internal/ads/vs;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ws;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/os;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/os;-><init>(Lcom/google/android/gms/internal/ads/ws;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ws;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-object v0
.end method
