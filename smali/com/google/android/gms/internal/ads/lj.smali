.class final synthetic Lcom/google/android/gms/internal/ads/lj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/tj;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lj;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/lj;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/ev;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lj;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/lj;->b:Ljava/lang/String;

    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v1, v0}, Lcom/google/android/gms/internal/ads/ev;->a(Lb/c/b/a/d/a;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
