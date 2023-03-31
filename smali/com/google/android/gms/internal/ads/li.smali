.class final synthetic Lcom/google/android/gms/internal/ads/li;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/mi;

.field private final c:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/mi;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/li;->b:Lcom/google/android/gms/internal/ads/mi;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/li;->c:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li;->b:Lcom/google/android/gms/internal/ads/mi;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/li;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/mi;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method
