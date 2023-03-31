.class final synthetic Lcom/google/android/gms/internal/ads/fq2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/cq2;

.field private final c:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/cq2;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fq2;->b:Lcom/google/android/gms/internal/ads/cq2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fq2;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fq2;->b:Lcom/google/android/gms/internal/ads/cq2;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fq2;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/cq2;->a(Landroid/content/Context;)Lcom/google/android/gms/ads/x/c;

    return-void
.end method
